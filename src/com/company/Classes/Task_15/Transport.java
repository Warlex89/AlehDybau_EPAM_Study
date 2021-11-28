package com.company.Classes.Task_15;

public enum Transport {
    PLANE,
    BUS,
    SHIP,
    CAR,
    TRAIN;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
