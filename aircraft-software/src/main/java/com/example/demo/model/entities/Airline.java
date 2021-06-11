package com.example.demo.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "airlines")
public class Airline extends BaseEntity{

	@Column(name = "airline_name")
	private String airlineName;
	
	@Column(name = "airline_code")
	private String airlineCode;

	@ManyToOne
	private Location location;
	
	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	
	
}
