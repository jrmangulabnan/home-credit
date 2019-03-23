package org.home.credit.app.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.home.credit.integration.api.OpenWeatherMapApiClient;
import org.home.credit.integration.dto.WeatherResp;
import org.home.credit.repository.WeatherLog;
import org.home.credit.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class will centralize all the service from integration and repository
 * project
 * 
 * @author jr mangulabnan
 *
 */
@Service
public class WeatherAggregateService {

	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private OpenWeatherMapApiClient openWeatherMapApiClient;

	@Autowired
	private WeatherRepository weatherRepository;

	/**
	 * It will fetch weather from https://openweathermap.org/current via then store
	 * it to db via
	 * 
	 * @param location
	 * @return Weather
	 * @throws Exception
	 */
	public WeatherResp getWeather() {
		WeatherResp weatherResp = openWeatherMapApiClient.getWeather();
		for (WeatherResp.WeatherDetail weatherDetail : weatherResp.getList()) {
			WeatherLog weatherLog = new WeatherLog.Builder().withId(counter.incrementAndGet())
					.withResponseId(String.valueOf(weatherDetail.getId())).withLocation(weatherDetail.getName())
					.withActualWeather(weatherDetail.getWeather().get(0).getDescription())
					.withTemparature(String.valueOf(weatherDetail.getMain().getTemp())).build();
			weatherRepository.save(weatherLog);
		}
		return weatherResp;
	}
}
