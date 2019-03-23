package org.home.credit.integration.api;

import org.home.credit.integration.dto.WeatherResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * Contains the api that get the weather from openweathermap
 * 
 * @author Jr Mangulabnan
 *
 */
public class OpenWeatherMapApiClient {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RetryTemplate retryTemplate;

	/**
	 * Query the weather
	 * 
	 * @return WeatherResp
	 */
	public WeatherResp getWeather() {
		String url = "https://samples.openweathermap.org/data/2.5/group?id=2643743,3067696,5391959&units=metric&appid=b6907d289e10d714a6e88b30761fae22";
		return retryTemplate.execute(r -> {
			return restTemplate.getForObject(url, WeatherResp.class);
		});
	}
}
