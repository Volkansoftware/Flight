package com.example.Flight.dto;

import com.example.Flight.FlightStatusEnum;
import com.example.Flight.entity.RouteEntity;

import java.util.Date;


// this class is used to post the data to the database
public class FlightRequest {

    private String flightNumber;

    private Long routeId;

    private double price;

    private Date departureTime;

    private Date arrivalTime;

    private int capacity;

    private FlightStatusEnum status;

    private RouteEntity route;

    public FlightRequest() {

    }

    public FlightRequest(String flightNumber, Long routeId, double price, Date departureTime, Date arrivalTime, int capacity, FlightStatusEnum status, RouteEntity route) {
        this.flightNumber = flightNumber;
        this.routeId = routeId;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
        this.status = status;
        this.route = route;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FlightStatusEnum getStatus() {
        return status;
    }

    public void setStatus(FlightStatusEnum status) {
        this.status = status;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public void setRoute(RouteEntity route) {
        this.route = route;
    }
}
