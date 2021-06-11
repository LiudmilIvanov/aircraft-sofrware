package com.example.demo.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "airplanes")
public class Airplane extends BaseEntity{

	@Column(name = "airplane_name")
	private String airplaneName;
	
	@Column(name = "airplane_code")
	private String airplaneCode;

	@OneToMany
	private List<Passenger> passengers;
	
	public String getAirplaneName() {
		return airplaneName;
	}

	public Airplane setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
		return this;
	}

	public String getAirplaneCode() {
		return airplaneCode;
	}

	public Airplane setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
		return this;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public Airplane setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
		return this;
	}
	
	
	
}
