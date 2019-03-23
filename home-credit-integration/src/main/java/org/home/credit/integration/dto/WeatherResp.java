package org.home.credit.integration.dto;

import java.util.List;

public class WeatherResp {

	private List<WeatherDetail> list;
	private int cnt;

	public List<WeatherDetail> getList() {
		return list;
	}

	public void setList(List<WeatherDetail> list) {
		this.list = list;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static class WeatherDetail {
		private Coord coord;
		private List<Weather> weather;
		private Main main;
		private int visibility;
		private Wind wind;
		private Clouds clouds;
		private String dt;
		private Sys sys;
		private int id;
		private String name;
		private int cod;

		public Coord getCoord() {
			return coord;
		}

		public void setCoord(Coord coord) {
			this.coord = coord;
		}

		public List<Weather> getWeather() {
			return weather;
		}

		public void setWeather(List<Weather> weather) {
			this.weather = weather;
		}

		public Main getMain() {
			return main;
		}

		public void setMain(Main main) {
			this.main = main;
		}

		public int getVisibility() {
			return visibility;
		}

		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}

		public Wind getWind() {
			return wind;
		}

		public void setWind(Wind wind) {
			this.wind = wind;
		}

		public Clouds getClouds() {
			return clouds;
		}

		public void setClouds(Clouds clouds) {
			this.clouds = clouds;
		}

		public String getDt() {
			return dt;
		}

		public void setDt(String dt) {
			this.dt = dt;
		}

		public Sys getSys() {
			return sys;
		}

		public void setSys(Sys sys) {
			this.sys = sys;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

	}

	public static class Coord {
		private double lon;
		private double lat;

		public double getLon() {
			return lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}
	}

	public static class Weather {
		private int id;
		private String main;
		private String description;
		private String icon;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}
	}

	public static class Main {
		private double temp;
		private int pressure;
		private int humidity;
		private double tempMin;
		private double tempMax;

		public double getTemp() {
			return temp;
		}

		public void setTemp(double temp) {
			this.temp = temp;
		}

		public int getPressure() {
			return pressure;
		}

		public void setPressure(int pressure) {
			this.pressure = pressure;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

		public double getTempMin() {
			return tempMin;
		}

		public void setTempMin(double tempMin) {
			this.tempMin = tempMin;
		}

		public double getTempMax() {
			return tempMax;
		}

		public void setTempMax(double tempMax) {
			this.tempMax = tempMax;
		}
	}

	public static class Wind {
		private double speed;
		private double deg;

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getDeg() {
			return deg;
		}

		public void setDeg(double deg) {
			this.deg = deg;
		}
	}

	public static class Clouds {
		private double all;

		public double getAll() {
			return all;
		}

		public void setAll(double all) {
			this.all = all;
		}

	}

	public static class Sys {
		private int type;
		private long id;
		private double message;
		private String country;
		private int sunrise;
		private int sunset;

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public double getMessage() {
			return message;
		}

		public void setMessage(double message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getSunrise() {
			return sunrise;
		}

		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}

		public int getSunset() {
			return sunset;
		}

		public void setSunset(int sunset) {
			this.sunset = sunset;
		}
	}

}
