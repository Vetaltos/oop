package ru.sechko.homework.car.vehicles;

import ru.sechko.homework.car.details.Engine;
import ru.sechko.homework.car.professions.Driver;

public class SportCar extends Car {
    private double maxSpeed;

    public SportCar(String brandName, String className, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(brandName, className, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public SportCar(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
