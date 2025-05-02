package ru.sechko.homework.cloth;

public class Skirt extends Cloth implements WomanCloth {

    public Skirt(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    public Skirt() {
        super();
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщину нарядили в юбку");
    }

    @Override
    public void dressMan() {

    }
}
