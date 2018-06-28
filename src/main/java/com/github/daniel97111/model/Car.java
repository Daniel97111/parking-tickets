package com.github.daniel97111.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String licensePlate;
    private Long minutesParked;

    public Car() {
    }

    public Car(String model, String licensePlate, Long minutesParked) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.minutesParked = minutesParked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(Long minutesParked) {
        this.minutesParked = minutesParked;
    }
}
