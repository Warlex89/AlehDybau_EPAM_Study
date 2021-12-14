package com.company.Basics_of_OOP.Task_4.Class_Information;

public class Coin extends Treasure{
    public static final String RED = "\u001B[31m";
    private String descriptionOfTreasure;

    public Coin (String name, int price, String type, String descriptionOfTreasure) {
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
        return RED + "Тип сокровища: "+ RESET+super.getType()+";"+
                RED + " Название: "+ RESET+super.getName()+";"+
                RED + " Стоимость : "+ RESET+super.getPrice()+";"+
                RED + " Описание: "+ RESET+descriptionOfTreasure;
    }
}
