package com.example.Flight.entity;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name="mt_route")
public class RouteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "route_source")
    private AirportEntity source;

    @ManyToOne
    @JoinColumn(name = "route_destination")
    private AirportEntity destination;
    @Column(name = "route_distance")
    private Double distanceInMiles;

    public RouteEntity(Long id, AirportEntity source, AirportEntity destination, Double distanceInMiles) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.distanceInMiles = distanceInMiles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AirportEntity getSource() {
        return source;
    }

    public void setSource(AirportEntity source) {
        this.source = source;
    }

    public AirportEntity getDestination() {
        return destination;
    }

    public void setDestination(AirportEntity destination) {
        this.destination = destination;
    }

    public Double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(Double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }
}