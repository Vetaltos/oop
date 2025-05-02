package ru.sechko.homework.cloth;

public class TShort extends Cloth implements ManCloth, WomanCloth {
    public TShort(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    public TShort() {
        super();
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчину нарядили в футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщину нарядили в футболку");
    }
}
