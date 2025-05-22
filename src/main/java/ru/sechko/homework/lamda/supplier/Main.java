package ru.sechko.homework.lamda.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(10);

        System.out.println("Random Supplier: " + randomSupplier.get());
    }
}
