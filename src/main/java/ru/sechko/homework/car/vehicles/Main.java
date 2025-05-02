package ru.sechko.homework.car.vehicles;

import ru.sechko.homework.car.details.Engine;
import ru.sechko.homework.car.professions.Driver;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("Galina", 28, 7);
        Engine engine = new Engine("v6", 116);
        Car car = new Car("Ford", "NORMAL`NO", 1865, driver, engine);

        System.out.println(car);

    }
}