package org.home.credit.repository.data;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WEATHER_LOG")
@TypeAlias("WEATHER_LOG")
public class WeatherLog {
	@Id
	private long id;
	private String responseId;
	private String location;
	private String actualWeather;
	private String temparature;
	private Timestamp timestamp;

	public WeatherLog() {
		timestamp = new Timestamp(new Date().getTime());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActualWeather() {
		return actualWeather;
	}

	public void setActualWeather(String actualWeather) {
		this.actualWeather = actualWeather;
	}

	public String getTemparature() {
		return temparature;
	}

	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public static class Builder {

		private long id;
		private String responseId;
		private String location;
		private String actualWeather;
		private String temparature;

		public Builder withId(long id) {
			this.id = id;
			return this;
		}

		public Builder withResponseId(String responseId) {
			this.responseId = responseId;
			return this;
		}

		public Builder withLocation(String location) {
			this.location = location;
			return this;
		}

		public Builder withActualWeather(String actualWeather) {
			this.actualWeather = actualWeather;
			return this;
		}

		public Builder withTemparature(String temparature) {
			this.temparature = temparature;
			return this;
		}

		public WeatherLog build() {
			WeatherLog weatherLog = new WeatherLog();
			weatherLog.id = this.id;
			weatherLog.responseId = this.responseId;
			weatherLog.location = this.location;
			weatherLog.actualWeather = this.actualWeather;
			weatherLog.temparature = this.temparature;
			return weatherLog;
		}
	}

}
