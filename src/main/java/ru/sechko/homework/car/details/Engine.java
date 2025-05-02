package ru.sechko.homework.car.details;

public class Engine {
    private String prodName;
    private double power;

    public Engine(String prodName, double power) {
        this.prodName = prodName;
        this.power = power;
    }

    public Engine() {}

    @Override
    public String toString() {
        return "Engine{" +
                "prodName='" + prodName + '\'' +
                ", power=" + power +
                '}';
    }
}

