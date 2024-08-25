package com.spcar.spcar.services;

import com.spcar.spcar.dtos.RentOutputDTO;

/**
 * Interface RentService
 *
 * Esta interface fornece métodos para gerenciar o aluguel de carros.
 *
 * Métodos:
 * - rentCar: Aluga um carro com base no modelo, número de dias e quilômetros percorridos.
 */
public interface RentService {

    RentOutputDTO rentCar(String model, int days, double kilometers);
}