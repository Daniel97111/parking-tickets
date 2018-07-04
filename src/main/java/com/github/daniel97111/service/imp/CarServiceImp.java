package com.github.daniel97111.service.imp;

import com.github.daniel97111.Dto.Car_Dto.CarDto;
import com.github.daniel97111.model.Car;
import com.github.daniel97111.repository.CarRepository;
import com.github.daniel97111.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CarServiceImp implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImp(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car findCarByID(Long id) {
        return carRepository.getOne(id);
    }

    @Override
    public Set<Car> showAllCars() {
        return new HashSet<>(carRepository.findAll());
    }

    @Override
    public Car newCar(CarDto carDto) {
        Car carNew = new Car();
        carNew.setModel(carDto.getModel());
        carNew.setLicensePlate(carDto.getLicensePlate());
        return carRepository.save(carNew);
    }


    @Override
    public void deleteCartById(Long id) {
        carRepository.deleteById(id);
    }
}
