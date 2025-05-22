package ru.sechko.homework.lamda.predicathm;

import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {
        Predicate<String> predicateNotNull = s -> s != null;

        Predicate<String> predicateNotEquals = s -> !s.isBlank();

        Predicate<String> isValidString = predicateNotNull.and(predicateNotEquals);

    }
}
