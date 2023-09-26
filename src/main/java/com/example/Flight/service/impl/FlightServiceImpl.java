package com.example.Flight.service.impl;


import com.example.Flight.entity.FlightEntity;
import com.example.Flight.repository.FlightRepository;
import com.example.Flight.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl (FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<FlightEntity> findAllFlight() {
        return flightRepository.findAll();
    }

    @Override
    public Optional<FlightEntity> findById(Long id) {
        return flightRepository.findById(id);
    }

    @Override
    public FlightEntity saveFlight(FlightEntity flightEntity) {
        return flightRepository.save(flightEntity);
    }

    @Override
    public FlightEntity updateFlight(FlightEntity flightEntity) {
        return flightRepository.save(flightEntity);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
