package com.example.Flight.entity;


import com.example.Flight.FlightStatusEnum;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mt_flight")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "flight_id")
    private Long id;


    @Column(name= "flight_num")
    private String flightNumber;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteEntity route;




    @Column(name= "flight_price")
    private double price;


    @Column(name = "flight_depart")
    @Temporal(TemporalType.TIMESTAMP) // or @Temporal(TemporalType.DATE) if you want to store only the date
    private Date departureTime;

    @Column(name = "flight_arr")
    @Temporal(TemporalType.TIMESTAMP) // or @Temporal(TemporalT ype.DATE) if you want to store only the date
    private Date arrivalTime;


    @Column(name= "flight_capacity")
    private int capacity;

    @Column(name= "flight_status")
    private FlightStatusEnum status;

    public FlightEntity(Long id, String flightNumber, RouteEntity route, double price, Date departureTime, Date arrivalTime, int capacity, FlightStatusEnum status) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.route = route;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public void setRoute(RouteEntity route) {
        this.route = route;
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
}


