package com.company.Basics_of_OOP.Task_2;
import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    private final String nameShop;
    ArrayList<Product> products;

    public Shop(String nameShop) {
        this.nameShop = nameShop;
        this.products = new ArrayList<>(Arrays.asList(
                new Product("Картошка",12.34f),
                new Product("Морковь",9.25f),
                new Product("Масло",6.95f),
                new Product("Сыр",21.37f),
                new Product("Колбаса",15.2f)));
    }

    public void outAllProducts() {
        products.forEach(System.out::println);
    }

    public void addNewProduct(String nameProduct, double price){
        products.add(new Product(nameProduct, price));
    }

    public String getNameShop() {
        return nameShop;
    }
}
