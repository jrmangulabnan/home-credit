package org.home.credit.app.controller;

import org.home.credit.integration.dto.WeatherResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The WeatherController is a controller that shoot out request to
 * WeatherAggregateService
 * 
 * @author jr mangulabnan
 *
 */
@RestController
public class WeatherController {

	@Autowired
	WeatherAggregateService weatherAggregateService;

	/**
	 * This method would be the available api visit this link to try
	 * http://localhost:8080/weather?location=London
	 * 
	 * @param location
	 * @return Weather
	 * @throws Exception
	 */
	@RequestMapping("/weather")
	public WeatherResp getWeather() {
		return weatherAggregateService.getWeather();
	}

	public WeatherAggregateService getWeatherAggregateService() {
		return weatherAggregateService;
	}

	public void setWeatherAggregateService(WeatherAggregateService weatherAggregateService) {
		this.weatherAggregateService = weatherAggregateService;
	}

}