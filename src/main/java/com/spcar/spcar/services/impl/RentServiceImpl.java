package com.spcar.spcar.services.impl;

import com.spcar.spcar.dtos.RentOutputDTO;
import com.spcar.spcar.entities.Car;
import com.spcar.spcar.repositories.CarRepository;
import com.spcar.spcar.services.RentService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    private final CarRepository carRepository;

    @Autowired
    public RentServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Método para alugar um carro com base no modelo, número de dias e quilômetros percorridos.
     *
     * @param model O modelo do carro a ser alugado.
     * @param days O número de dias para o aluguel.
     * @param kilometers O número de quilômetros percorridos.
     * @return RentOutputDTO contendo o carro alugado e o preço total do aluguel.
     */
    @Override
    public RentOutputDTO rentCar(String model, int days, double kilometers) {
        Car car = carRepository.findCarByModel(model);
        if (car != null) {
            double totalPriceForRenting = car.getDailyPriceForRenting() * days + 0.20 * kilometers;
            return new RentOutputDTO(car, totalPriceForRenting);
        }
        return null;
    }

    /**
     * Método para inserir carros no repositório se não houver nenhum.
     * Este método é executado após a construção do bean.
     */
    @PostConstruct
    void insertCarsIfThereIsNone() {
        if (carRepository.count() == 0) {
            List<Car> cars = List.of(
                    new Car("Toyota", "Corolla", "Red", 2019, 1000, false),
                    new Car("Honda", "Civic", "Blue", 2020, 1200, false),
                    new Car("Ford", "Focus", "Black", 2018, 900, false),
                    new Car("Chevrolet", "Malibu", "Silver", 2017, 1100, false),
                    new Car("BMW", "3 Series", "White", 2021, 1500, false),
                    new Car("Audi", "A4", "Gray", 2022, 1600, false),
                    new Car("Mercedes-Benz", "C-Class", "Blue", 2020, 1700, false),
                    new Car("Volkswagen", "Passat", "Red", 2019, 1300, false),
                    new Car("Nissan", "Altima", "Green", 2021, 1400, false),
                    new Car("Hyundai", "Elantra", "Orange", 2018, 950, false),
                    new Car("Kia", "Optima", "Yellow", 2020, 1150, false),
                    new Car("Subaru", "Impreza", "Purple", 2019, 1050, false),
                    new Car("Mazda", "Mazda3", "Brown", 2022, 1250, false),
                    new Car("Jaguar", "XE", "Black", 2021, 1800, false),
                    new Car("Lexus", "IS", "Silver", 2020, 1550, false),
                    new Car("Porsche", "Macan", "Gray", 2022, 2000, false),
                    new Car("Land Rover", "Discovery", "White", 2021, 1900, false),
                    new Car("Tesla", "Model 3", "Red", 2023, 2500, false),
                    new Car("Chevrolet", "Camaro", "Blue", 2021, 1700, false),
                    new Car("Ford", "Mustang", "Yellow", 2019, 1600, false),
                    new Car("Jeep", "Cherokee", "Green", 2022, 1400, false)
            );
            carRepository.saveAll(cars);
        }
    }
}