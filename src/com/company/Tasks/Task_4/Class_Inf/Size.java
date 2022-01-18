package com.company.Tasks.Task_4.Class_Inf;

public enum Size {
    SMALL(10), MIDDLE(50), LARGE(100);
    public int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
