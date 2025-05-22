package ru.sechko.homework.lamda.function;


import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = integer -> integer > 0;
        Predicate<Integer> isNegative = integer -> integer < 0;

        Function<Integer, String> checkNumber = x -> {
            if (isPositive.test(x)) {
                return "Положительное число";
            }  else if (isNegative.test(x)) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        System.out.println(checkNumber.apply(0));
        System.out.println(checkNumber.apply(1));
        System.out.println(checkNumber.apply(-1));

    }
}
