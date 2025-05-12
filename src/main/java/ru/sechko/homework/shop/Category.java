package ru.sechko.homework.shop;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] selection;

    public Category(String name, Product[] selection) {
        this.name = name;
        this.selection = selection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getSelection() {
        return selection;
    }

    public void setSelection(Product[] selection) {
        this.selection = selection;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", selection=" + Arrays.toString(selection) +
                '}';
    }
}
