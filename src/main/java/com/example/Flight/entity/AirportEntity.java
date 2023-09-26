package com.example.Flight.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "mt_airport")
public class AirportEntity {
    @Id
    @Column (name = "airport_id")
    private Long id;
    @Column(name="airport_name")
    private String name;

    @Column(name="airport_code")
    private String code;

    @Column(name="airport_city")
    private String city;


    @Column(name="airport_country")
    private String country;

    public AirportEntity(String name, String code, String city, String country) {
        this.name = name;
        this.code = code;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

