package com.spcar.spcar.repositories;

import com.spcar.spcar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Car findCarByModel(String model);
}