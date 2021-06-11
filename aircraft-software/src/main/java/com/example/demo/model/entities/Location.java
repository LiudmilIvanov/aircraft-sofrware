package com.example.demo.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location extends BaseEntity{

	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "city_name")
	private String cityName;
	
	public String getCountryName() {
		return countryName;
	}
	public Location setCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}
	public String getCityName() {
		return cityName;
	}
	public Location setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}
	
	
	
}
