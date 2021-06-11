package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long>{

}
