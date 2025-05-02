package ru.sechko.homework.car.vehicles;


import ru.sechko.homework.car.details.Engine;
import ru.sechko.homework.car.professions.Driver;

public class Car {
    private String brandName;
    private String className;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brandName, String className, double weight, Driver driver, Engine engine) {
        this.brandName = brandName;
        this.className = className;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {

    }

    public void start() {
        System.out.println("Поехали");
    }
    public void stop() {
        System.out.println("Останавливаемся");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\n' +
                ", className='" + className + '\n' +
                ", weight=" + weight + '\n' +
                ", driver=" + driver + '\n' +
                ", engine=" + engine +
                '}';
    }
}

