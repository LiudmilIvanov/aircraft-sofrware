package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>{

	Airport findByLocation_CityName(String name);
}
