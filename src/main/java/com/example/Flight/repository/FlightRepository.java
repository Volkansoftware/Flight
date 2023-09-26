package com.example.Flight.repository;

import com.example.Flight.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FlightRepository extends JpaRepository<FlightEntity, Long> {

}
