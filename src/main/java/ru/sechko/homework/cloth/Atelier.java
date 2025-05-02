package ru.sechko.homework.cloth;

public class Atelier {

    public void dressMan (Cloth[] cloth) {
        for (Cloth c : cloth) {
            c.dressMan();
        }
    }

    public void dressWoman (Cloth[] cloth) {
        for (Cloth c : cloth) {
            c.dressWoman();
        }
    }
}
