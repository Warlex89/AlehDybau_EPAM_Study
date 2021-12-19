package com.company.Basics_of_OOP.Task_5.Classes_Information;

public enum WrapType {
    CARDBOARD_BOX("Cardboard box", 1.5),
    METAL_BOX("Metal Box", 5.0),
    FOIL_POUCHES("Foil Pouch", 2),
    PLASTIC_BAG("Plastic Bag", 0.5);
    private final String wrapName;
    private final double wrapPrice;

    WrapType(String name, double price) {
        this.wrapName = name;
        this.wrapPrice = price;
    }

    public String getName() {
        return wrapName;
    }

    public double getPrice() {
        return wrapPrice;
    }
}
