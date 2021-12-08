package com.company.Basics_of_OOP.Task_2;

public class Product {
    private final String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("наименование товара: %s, цена: %.2f", name, price);
    }
}
