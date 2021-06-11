package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.entities.Airline;
import com.example.demo.model.entities.Airplane;
import com.example.demo.model.entities.Airport;
import com.example.demo.model.entities.Location;
import com.example.demo.model.entities.Passenger;
import com.example.demo.model.entities.Route;
import com.example.demo.repository.AirlineRepository;
import com.example.demo.repository.AirplaneRepository;
import com.example.demo.repository.AirportRepository;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.RouteRepository;

@Component
public class DBInit implements CommandLineRunner{

	private final PassengerRepository passengerRepository;
	private final AirplaneRepository airplaneRepository;
	private final AirportRepository airportRepository;
	private final LocationRepository locationRepository;
	private final AirlineRepository airlineRepository;
	private final RouteRepository routeRepository;
	
	
	@Autowired
	public DBInit(PassengerRepository passengerRepository, AirplaneRepository airplaneRepository, AirportRepository airportRepository, LocationRepository locationRepository, AirlineRepository airlineRepository, RouteRepository routeRepository) {
		this.passengerRepository = passengerRepository;
		this.airplaneRepository = airplaneRepository;
		this.airportRepository = airportRepository;
		this.locationRepository = locationRepository;
		this.airlineRepository = airlineRepository;
		this.routeRepository = routeRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		initLocations();
		initPassengers();
		initAirplane();
		initAirport();
		initAirline();
		initRoute();
	}

	private void initLocations() {
		Location locationOne = new Location();
		Location locationTwo = new Location();
		Location locationThree = new Location();
		
		locationOne.setCityName("Sofia") 
		           .setCountryName("Bulgaria");
					
		
		locationThree.setCountryName("United Kingdom")
					 .setCityName("London");
		
		locationTwo.setCountryName("France")
				   .setCityName("Paris");
		
		locationRepository.saveAll(List.of(locationOne, locationTwo, locationThree));
		
	}



	private void initRoute() {
		Route route = new Route();
		route.setDepartureAirport(airportRepository.findByLocation_CityName("Sofia"))
			  .setArrivalAirport(airportRepository.findByLocation_CityName("London"))
			  .setAirlines(airlineRepository.findAll());
		routeRepository.save(route);
	}



	private void initAirline() {
		Airline airline = new Airline();
		airline.setAirlineName("British Airlines")
				.setAirlineCode("AFG123")
		        .setLocation(locationRepository.findByCityName("London"));
		airlineRepository.save(airline);
	}



	private void initAirport() {
		Airport airport = new Airport();
		airport.setLocation(locationRepository.findByCityName("Paris"));
		airportRepository.save(airport);
	}



	private void initPassengers() {
		Passenger passenger = new Passenger();
		passenger.setFirstName("George")
				 .setLastName("Smith")
				 .setEmail("joshSmith@gmail.com");
		passengerRepository.save(passenger);
	}



	private void initAirplane() {
		Airplane plane = new Airplane();
		plane.setAirplaneName("airforce-one")
			 .setAirplaneCode("HGF3405")
			 .setPassengers(passengerRepository.findAll());
		airplaneRepository.save(plane);
		
	}

}
