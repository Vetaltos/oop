package ru.sechko.homework.lamda.consumerhm;

public class HeavyBox {
    private double width;

    public HeavyBox(double width) {
        this.width = width;
    }

    public HeavyBox() {

    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "width=" + width +
                '}';
    }
}
