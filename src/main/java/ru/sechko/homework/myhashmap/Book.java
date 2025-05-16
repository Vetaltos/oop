package ru.sechko.homework.myhashmap;

public class Book {
    private String name;
    private String author;
    private double cost;

    public Book(String name, String author, double cost) {
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                '}';
    }
}
