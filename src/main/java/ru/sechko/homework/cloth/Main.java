package ru.sechko.homework.cloth;

public class Main {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();

        Cloth[] cloths = new Cloth[4];
        cloths[0] = new TShort();
        cloths[1] = new Trousers();
        cloths[2] = new Skirt();
        cloths[3] = new Tie();

        atelier.dressWoman(cloths);
        atelier.dressMan(cloths);
    }
}
