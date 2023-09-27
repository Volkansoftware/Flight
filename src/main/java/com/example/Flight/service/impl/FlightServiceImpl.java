package com.example.Flight.service.impl;


import com.example.Flight.dto.FlightRequest;
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

    // this method is used to save the flight
    @Override
    public String saveFlight(FlightRequest flightRequest) {
        // we are creating a new object of FlightEntity
        FlightEntity flightEntity = new FlightEntity();
        flightEntity.setFlightNumber(flightRequest.getFlightNumber());
        flightEntity.setPrice(flightRequest.getPrice());
        flightEntity.setDepartureTime(flightRequest.getDepartureTime());
        flightEntity.setArrivalTime(flightRequest.getArrivalTime());
        flightEntity.setCapacity(flightRequest.getCapacity());
        flightEntity.setStatus(flightRequest.getStatus());
        flightEntity.setRoute(flightRequest.getRoute());

        // we are saving the flightEntity object in the database
        try {
            flightRepository.save(flightEntity);
            return "Flight saved";
        } catch (Exception e) {
            // if there is any error while saving the flight, we are returning the error message
             System.out.println("Error: " + e.getMessage());
                return "Error: " + e.getMessage();
        }
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
