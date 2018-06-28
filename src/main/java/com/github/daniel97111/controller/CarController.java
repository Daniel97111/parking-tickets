package com.github.daniel97111.controller;



import com.github.daniel97111.Dto.Car_Dto.CarDto;
import com.github.daniel97111.model.Car;
import com.github.daniel97111.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id}")
    public CarDto findOneCarById(@PathVariable Long id) {
        Car car = carService.findCarByID(id);
        return new CarDto(car);
    }

    @GetMapping
    public Set<Car> findAll() {
        return carService.showAllCars();
    }

    @PostMapping("/add")
    public CarDto createClientCar(@RequestBody CarDto newCar) {
        Car car = carService.newCar(newCar);
        return new CarDto(car);
    }



    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCartById(id);
    }




}
