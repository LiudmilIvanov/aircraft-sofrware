package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.Airplane;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Long>{

}
