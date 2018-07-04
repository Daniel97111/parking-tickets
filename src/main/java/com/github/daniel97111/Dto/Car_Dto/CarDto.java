package com.github.daniel97111.Dto.Car_Dto;

import com.github.daniel97111.model.Car;

public class CarDto {

    private Long id;
    private String model;
    private String licensePlate;
    private Long minutesParked;

    public CarDto() {
    }

    public CarDto(Car car) {
        this.id = car.getId();
        this.model = car.getModel();
        this.licensePlate = car.getLicensePlate();
        this.minutesParked = car.getMinutesParked();
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
