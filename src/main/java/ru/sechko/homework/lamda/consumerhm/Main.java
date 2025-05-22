package ru.sechko.homework.lamda.consumerhm;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(78.77);

        Consumer<HeavyBox> printShipmentMsg = s  -> System.out.println("Отгрузили ящик весом " +  s.getWidth());

        Consumer<HeavyBox> printSendingMsg = s -> System.out.println("Отправили ящик весом " +  s.getWidth());

        Consumer<HeavyBox> report = printShipmentMsg.andThen(printSendingMsg);

        report.accept(heavyBox);
    }
}
