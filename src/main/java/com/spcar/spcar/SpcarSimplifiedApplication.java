package com.spcar.spcar;

import java.util.Scanner;

/**
 * Versão simplificada do aplicativo Spcar.
 * Este aplicativo solicita ao usuário o tipo de veículo, o valor da diária, a quantidade de dias e a quantidade de quilômetros percorridos.
 * Em seguida, calcula o preço total da locação e exibe o modelo do veículo e o preço total.
 * Este aplicativo não utiliza classes, métodos ou outras técnicas avançadas.
 * O objetivo é fornecer um exemplo simples para fins de aprendizado.
 * Para uma versão mais avançada do aplicativo Spcar, consulte o repositório Spcar.
 * @Author: Gustavo Toledo
 */
public class SpcarSimplifiedApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carModel;
        int rentingDays;
        double dailyRentPrice, estimatedKilometers, fixedTax, totalPrice;

        fixedTax = 0.20;

        System.out.println("Entre com o modelo de véiculo:");
        carModel = scanner.nextLine();
        System.out.println("Digite o valor da diária:");
        dailyRentPrice = scanner.nextDouble();
        System.out.println("Digite a quantidade de dias:");
        rentingDays = scanner.nextInt();
        System.out.println("Digite a quantidade de Km percorridos");
        estimatedKilometers = scanner.nextDouble();

        totalPrice = (dailyRentPrice * rentingDays) + (fixedTax * estimatedKilometers);

        System.out.printf("Modelo do veículo:%s%n", carModel);
        System.out.printf("O preço total da locação é: R$%.2f%n", totalPrice);
    }
}