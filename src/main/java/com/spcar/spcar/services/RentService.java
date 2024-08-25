package com.spcar.spcar.services;

import com.spcar.spcar.dtos.RentOutputDTO;

public interface RentService {

    RentOutputDTO rentCar(String model, int days, double kilometers);
}
