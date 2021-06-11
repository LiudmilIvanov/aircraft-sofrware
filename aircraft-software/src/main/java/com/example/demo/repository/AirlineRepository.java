package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long>{

}
