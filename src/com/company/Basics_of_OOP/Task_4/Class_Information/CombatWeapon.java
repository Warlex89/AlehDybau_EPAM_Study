package com.company.Basics_of_OOP.Task_4.Class_Information;

public class CombatWeapon extends Treasure{
    public static final String BLUE = "\u001B[34m";
    private String descriptionOfTreasure;

    public CombatWeapon(String name, int price, String type, String descriptionOfTreasure) {
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
        return BLUE + "Тип сокровища: "+ RESET+super.getType()+";"+
                BLUE + " Название: "+ RESET+super.getName()+";"+
                BLUE + " Стоимость : "+ RESET+super.getPrice()+";"+
                BLUE + " Описание: "+ RESET+descriptionOfTreasure;
    }
}
