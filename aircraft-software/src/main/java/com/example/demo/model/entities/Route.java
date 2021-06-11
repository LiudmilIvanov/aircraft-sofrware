package com.example.demo.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity{

	@ManyToMany
	private List<Airline> airlines;
	
	@OneToOne
	private Airport departureAirport;
	
	@OneToOne
	private Airport arrivalAirport;

	public List<Airline> getAirlines() {
		return airlines;
	}

	public Route setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
		return this;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public Route setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
		return this;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public Route setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
		return this;
	}
	
	
}

