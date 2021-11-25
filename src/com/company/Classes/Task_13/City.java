package com.company.Classes.Task_13;

public record City(String name) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Название города: %s" + name;
    }
}


