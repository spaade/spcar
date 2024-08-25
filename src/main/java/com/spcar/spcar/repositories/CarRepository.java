package com.spcar.spcar.repositories;

import com.spcar.spcar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface CarRepository
 * Esta interface fornece métodos para realizar operações de CRUD na entidade Car.
 * Métodos:
 * - findCarByModel: Encontra um carro com base no modelo.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    /**
     * Encontra um carro com base no modelo.
     *
     * @param model O modelo do carro a ser encontrado.
     * @return O carro encontrado ou null se não houver correspondência.
     */
    Car findCarByModel(String model);
}