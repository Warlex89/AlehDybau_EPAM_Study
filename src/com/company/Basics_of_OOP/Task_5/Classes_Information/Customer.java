package com.company.Basics_of_OOP.Task_5.Classes_Information;

public class Customer {
    private String name;
    private Present present;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent(Present present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Уважаемый покупатель " + name +
                ", вот Ваш " + getPresent();
    }
}
