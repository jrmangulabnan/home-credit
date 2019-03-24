package org.home.credit.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "WeatherDb";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("localhost", 27017);
	}

	@Override
	protected String getMappingBasePackage() {
		return "org.home.credit.repository";
	}
}