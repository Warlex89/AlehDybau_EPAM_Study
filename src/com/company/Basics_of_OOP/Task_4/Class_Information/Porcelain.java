package com.company.Basics_of_OOP.Task_4.Class_Information;

public class Porcelain extends Treasure{
    public static final String GREY = "\u001B[37m";
    private String descriptionOfTreasure;

    public Porcelain(String name, int price, String type, String descriptionOfTreasure) {
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
        return GREY + "Тип сокровища: "+ RESET+super.getType()+";"+
                GREY + " Название: "+ RESET+super.getName()+";"+
                GREY + " Стоимость : "+ RESET+super.getPrice()+";"+
                GREY + " Описание: "+ RESET+descriptionOfTreasure;
    }
}
