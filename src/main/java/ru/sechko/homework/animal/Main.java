package ru.sechko.homework.animal;


public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Бобик");
        animals[1] = new Cat("Мурзик");
        animals[2] = new Bear("Мишаня");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].makeNoise();
        }

    }
}