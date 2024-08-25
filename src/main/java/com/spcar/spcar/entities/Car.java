package com.spcar.spcar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe Car
 *
 * Esta classe representa a entidade Carro no sistema de aluguel de carros.
 *
 * Atributos:
 * - id: Identificador único do carro.
 * - brand: Marca do carro.
 * - model: Modelo do carro.
 * - color: Cor do carro.
 * - manufactureYear: Ano de fabricação do carro.
 * - dailyPriceForRenting: Preço diário para alugar o carro.
 * - rented: Indica se o carro está alugado ou não.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String color;
    private int manufactureYear;
    private double dailyPriceForRenting;
    private boolean rented;

    public Car() {
    }

    public Car(String brand, String model, String color, int manufactureYear, double dailyPriceForRenting, boolean rented) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.dailyPriceForRenting = dailyPriceForRenting;
        this.rented = rented;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getmanufactureYear() {
        return manufactureYear;
    }

    public void setmanufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getDailyPriceForRenting() {
        return dailyPriceForRenting;
    }

    public void setDailyPriceForRenting(double dailyPriceForRenting) {
        this.dailyPriceForRenting = dailyPriceForRenting;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}