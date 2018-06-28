package com.github.daniel97111.service;


import com.github.daniel97111.Dto.Car_Dto.CarDto;
import com.github.daniel97111.model.Car;

import java.util.Set;

public interface CarService {

    Car findCarByID(Long id);

    Set<Car> showAllCars();

    Car newCar(CarDto car);

    void deleteCartById(Long id);
}
