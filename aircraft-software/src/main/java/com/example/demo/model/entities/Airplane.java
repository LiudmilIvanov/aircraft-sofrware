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

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public String getAirplaneCode() {
		return airplaneCode;
	}

	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	
}
