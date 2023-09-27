package com.example.Flight.service;

import com.example.Flight.dto.FlightRequest;
import com.example.Flight.entity.FlightEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<FlightEntity> findAllFlight();

    Optional<FlightEntity> findById(Long id);

    String saveFlight(FlightRequest flightRequest);

    FlightEntity updateFlight(FlightEntity flightEntity);

    void deleteFlight(Long id);
}
