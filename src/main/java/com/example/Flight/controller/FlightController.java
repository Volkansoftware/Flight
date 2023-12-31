package com.example.Flight.controller;

import com.example.Flight.dto.FlightRequest;
import com.example.Flight.entity.FlightEntity;
import com.example.Flight.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/flight")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;

    }


    // we can use (value = "/") or ("/") for the same purpose
    @GetMapping("/")
    public List<FlightEntity> findAllFlight() {
        return flightService.findAllFlight();
    }

    @GetMapping("/{id}")
    public Optional<FlightEntity> findFlightById(@PathVariable("id") Long id)
    {
        return flightService.findById(id);
    }

    @PostMapping("/")
    public String saveFlight(@RequestBody FlightRequest flightRequest){
        return flightService.saveFlight(flightRequest);
    }

    @PutMapping("/")
    public FlightEntity updateFlight(@RequestBody FlightEntity flightEntity){
        return flightService.updateFlight(flightEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable("id") Long id) {
        flightService.deleteFlight(id);
    }

}
