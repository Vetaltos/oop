package ru.sechko.homework.myhashmap;


import java.util.HashMap;
import java.util.Map;

public class BookShelf {
    public static Book bookOne = new Book("Самый богатый человек в Вавилоне", "G.S. Clason", 10.5);
    public static Book bookTwo = new Book("Хроники заводной птицы", "H. Murakami", 11.7);
    public static Book bookThree = new Book("1984", "G. Orwell", 10.7);

    public static Map<String, Book> books = new HashMap<>();

    public static void main(String[] args) {
        books.put(bookOne.getName(), bookOne);
        books.put(bookTwo.getName(), bookTwo);
        books.put(bookThree.getName(), bookThree);

        getEntry(books);
        getKey(books);
        getValue(books);
    }

    public static void getEntry(Map<String, Book> books) {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue() + " --- " + entry.getKey());
        }
    }

    public static void getKey(Map<String, Book> books) {
        System.out.println("-------------------------------------");
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static void getValue(Map<String, Book> books) {
        System.out.println("-------------------------------------");
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
