package org.home.credit.repository;

import org.home.credit.repository.data.WeatherLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Repository for WeatherLog
 * @author jr mangulabnan
 *
 */
@Repository
public class WeatherRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * Save the weathelog
	 * @param weatherLog
	 */
	public void save(WeatherLog weatherLog) {
		mongoTemplate.save(weatherLog);
	}

}
