package ru.sechko.homework.shop;

public class Main {
    public static void main(String[] args) {
        Product egg = new Product("Egg", 100.0, 4.4);
        Product bread = new Product("Bread", 70.0, 4.7);
        Product potato = new Product("Potato", 80.0, 4.3);
        Product cheese = new Product("Cheese", 90.0, 4.2);
        Product milk = new Product("Milk", 90.0, 4.7);
        Product yogurt = new Product("Yogurt", 90.0, 4.7);

        Product[] dairyProducts = {cheese, milk, yogurt};
        Product[] firstProducts = {egg, potato, bread};

        Category categoryDairyProduct = new Category("Dairy", dairyProducts);
        Category categoryFirstProduct = new Category("First Product", firstProducts);

        Basket basketOne = new Basket(dairyProducts);
        Basket basketTwo = new Basket(firstProducts);

        User userKolya = new User("Nikolya", "qwerty", basketOne);
        User userNataha = new User("Natashka", "12345", basketTwo);

        System.out.println(categoryDairyProduct);
        System.out.println(categoryFirstProduct);

        System.out.println(userKolya);
        System.out.println(userNataha);
    }
}
