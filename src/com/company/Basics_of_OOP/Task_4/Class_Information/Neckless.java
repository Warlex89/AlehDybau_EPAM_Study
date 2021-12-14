package com.company.Basics_of_OOP.Task_4.Class_Information;

public class Neckless extends Treasure {
    public static final String GREEN = "\u001B[32m";
    private String descriptionOfTreasure;

    public Neckless(String name, int price, String type, String descriptionOfTreasure) {
        super.setName(name);
        super.setPrice(price);
        super.setType(type);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return GREEN + "Тип сокровища: "+ RESET+super.getType()+";"+
                GREEN + " Название: "+ RESET+super.getName()+";"+
                GREEN + " Стоимость : "+ RESET+super.getPrice()+";"+
                GREEN + " Описание: "+ RESET+descriptionOfTreasure;
    }
}
