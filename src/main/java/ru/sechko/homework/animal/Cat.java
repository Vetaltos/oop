package ru.sechko.homework.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " is making noise");
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String getDescription() {
        return "It is a cat";
    }
}
