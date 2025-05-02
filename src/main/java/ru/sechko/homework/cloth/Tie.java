package ru.sechko.homework.cloth;

public class Tie extends Cloth implements ManCloth {
    public Tie(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    public Tie() {
        super();
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчину нарядили в галстук");
    }

    @Override
    public void dressWoman() {

    }
}
