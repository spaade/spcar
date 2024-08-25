package com.spcar.spcar.controllers;

import com.spcar.spcar.dtos.RentOutputDTO;
import com.spcar.spcar.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final RentService rentService;

    @Autowired
    public CarController(RentService rentService) {
        this.rentService = rentService;
    }

    @PostMapping("/rent")
    public ResponseEntity<RentOutputDTO> rentCar(@RequestParam String model, @RequestParam int days, @RequestParam double kilometers) {
        RentOutputDTO rentOutputDTO = rentService.rentCar(model, days, kilometers);
        return ResponseEntity.ok(rentOutputDTO);
    }
}