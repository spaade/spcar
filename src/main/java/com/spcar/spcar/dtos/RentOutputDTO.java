package com.spcar.spcar.dtos;

import com.spcar.spcar.entities.Car;

public class RentOutputDTO {

    private Car carModel;
    private double totalPriceForRenting;

    public RentOutputDTO() {
    }

    public RentOutputDTO(Car carModel, double totalPriceForRenting) {
        this.carModel = carModel;
        this.totalPriceForRenting = totalPriceForRenting;
    }

    public Car getCarModel() {
        return carModel;
    }

    public double getTotalPriceForRenting() {
        return totalPriceForRenting;
    }

    public void setCarModel(Car carModel) {
        this.carModel = carModel;
    }

    public void setTotalPriceForRenting(double totalPriceForRenting) {
        this.totalPriceForRenting = totalPriceForRenting;
    }

    @Override
    public String toString() {
        return "RentOutputDTO{" + "carModel=" + carModel + ", totalPriceForRenting=" + totalPriceForRenting + '}';
    }
}
