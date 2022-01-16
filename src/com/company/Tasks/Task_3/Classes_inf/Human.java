package com.company.Tasks.Task_3.Classes_inf;

public class Human {
    public static final String RESET = "\u001B[0m";
    String name;
    String surname;
    String status;

    public Human(String name, String surname, String status) {
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
