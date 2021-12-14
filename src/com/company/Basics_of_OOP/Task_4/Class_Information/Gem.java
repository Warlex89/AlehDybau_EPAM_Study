package com.company.Basics_of_OOP.Task_4.Class_Information;

public class Gem extends Treasure{
    public static final String YELLOW = "\u001B[33m";
    private String descriptionOfTreasure;

    public Gem(String name, int price, String type, String descriptionOfTreasure) {
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
        return YELLOW + "Тип сокровища: "+ RESET+super.getType()+";"+
                YELLOW + " Название сокровищ: "+ RESET+super.getName()+";"+
                YELLOW + " Стоимость : "+ RESET+super.getPrice()+";"+
                YELLOW + " Описание: "+ RESET+descriptionOfTreasure;
    }
}
