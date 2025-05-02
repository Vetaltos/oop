package ru.sechko.homework.cloth;

public class Trousers extends Cloth implements ManCloth, WomanCloth {
    public Trousers(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    public Trousers() {
        super();
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчину нарядили в брюки");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщину нарядили в брюки");
    }
}
