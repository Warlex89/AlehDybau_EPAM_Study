package com.company.Basics_of_OOP.Task_5.Classes_Information;

public record Candy(String productName, double price, String typeOfCandy) {

    @Override
    public String toString() {
        return "Candy{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", typeOfCandy='" + typeOfCandy + '\'' +
                '}';
    }
}
