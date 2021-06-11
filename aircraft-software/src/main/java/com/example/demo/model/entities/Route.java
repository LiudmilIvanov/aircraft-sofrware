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
}

