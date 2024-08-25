package com.spcar.spcar.controllers;

import com.spcar.spcar.dtos.RentOutputDTO;
import com.spcar.spcar.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe RentController
 * Esta classe é responsável por gerenciar as requisições relacionadas ao aluguel de carros.
 * Métodos:
 * - rentCar: Aluga um carro com base no modelo, número de dias e quilômetros percorridos.
 */
@RestController
public class RentController {

    private final RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    /**
     * Aluga um carro com base no modelo, número de dias e quilômetros percorridos.
     *
     * @param model O modelo do carro a ser alugado.
     * @param days O número de dias para o aluguel.
     * @param kilometers O número de quilômetros percorridos.
     * @return ResponseEntity contendo o RentOutputDTO com os detalhes do aluguel.
     */
    @PostMapping("/rent")
    public ResponseEntity<RentOutputDTO> rentCar(@RequestParam String model, @RequestParam int days, @RequestParam double kilometers) {
        RentOutputDTO rentOutputDTO = rentService.rentCar(model, days, kilometers);
        return ResponseEntity.ok(rentOutputDTO);
    }
}