package org.home.credit.app.main;

import java.util.ArrayList;
import java.util.List;

import org.home.credit.integration.api.OpenWeatherMapApiClient;
import org.home.credit.integration.util.LoggingRequestInterceptor;
import org.home.credit.repository.WeatherRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * Container of any bean or config that would be import on HomeCreditApplication
 * 
 * @author jr mangulabnan
 *
 */
@Configuration
public class HomeCreditConfig {

	/**
	 * Bean for OpenWeatherMapApi
	 * 
	 * @return OpenWeatherMapApi
	 */
	@Bean
	public OpenWeatherMapApiClient openWeatherMapApiClient() {
		return new OpenWeatherMapApiClient();
	}

	/**
	 * Let's use RetryTemplate to lessen the chance of not receiving data from API
	 * and for the default value, let's set it to 1 retry only.
	 * 
	 * @return RetryTemplate
	 */

	@Bean
	@Scope("singleton")
	public RetryTemplate retryTemplate() {
		RetryTemplate retryTemplate = new RetryTemplate();
		retryTemplate.setThrowLastExceptionOnExhausted(true);
		retryTemplate.setRetryPolicy(new SimpleRetryPolicy(1));
		return retryTemplate;
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate(
				new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
		interceptors.add(new LoggingRequestInterceptor());
		restTemplate.setInterceptors(interceptors);
		return restTemplate;
	}

	@Bean
	public WeatherRepository weatherRepository() {
		return new WeatherRepository();
	}
}
