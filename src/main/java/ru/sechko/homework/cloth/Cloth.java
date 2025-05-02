package ru.sechko.homework.cloth;

import java.awt.event.MouseListener;

public abstract class Cloth implements ManCloth, WomanCloth {
    ClothingSize size;
    int price;
    String color;

    public Cloth(ClothingSize size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Cloth() {

    }
}
