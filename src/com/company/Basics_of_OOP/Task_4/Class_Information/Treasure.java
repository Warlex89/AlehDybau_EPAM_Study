package com.company.Basics_of_OOP.Task_4.Class_Information;

public abstract class Treasure {
    public static final String RESET = "\u001B[0m";
    private String name;
    private int price;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public abstract String toString();
}
