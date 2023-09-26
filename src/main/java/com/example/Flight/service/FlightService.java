package com.example.Flight.service;

import com.example.Flight.entity.FlightEntity;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<FlightEntity> findAllFlight();

    Optional<FlightEntity> findById(Long id);

    FlightEntity saveFlight(FlightEntity flightEntity);

    FlightEntity updateFlight(FlightEntity flightEntity);

    void deleteFlight(Long id);
}
