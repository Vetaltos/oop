package ru.sechko.homework.cloth;

public enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return (euroSize == 32) ? "Детский размер" : "Взослый размер";
    }
}
