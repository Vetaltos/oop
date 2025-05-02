package ru.sechko.homework.car.vehicles;


import ru.sechko.homework.car.details.Engine;
import ru.sechko.homework.car.professions.Driver;

public class Lorry extends Car{
    private double deliveryWeight;

    public Lorry(String brandName, String className, double weight, Driver driver, Engine engine, double deliveryWeight) {
        super(brandName, className, weight, driver, engine);
        this.deliveryWeight = deliveryWeight;
    }

    public Lorry() {

    }

    public Lorry(double deliveryWeight) {
        this.deliveryWeight = deliveryWeight;
    }

    public void start() {
        System.out.println("ГРУЗОВИК ДАЛ ГАЗУ");
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "deliveryWeight=" + deliveryWeight +
                '}';
    }
}

