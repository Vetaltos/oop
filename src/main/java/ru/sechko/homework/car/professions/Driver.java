package ru.sechko.homework.car.professions;


public class Driver extends Person {

    private double drivingExp;

    public Driver(String fullName, int age, double drivingExp) {
        super(fullName, age);
        this.drivingExp = drivingExp;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "drivingExp=" + drivingExp +
                '}';
    }
}
