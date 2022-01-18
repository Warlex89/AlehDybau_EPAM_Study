package com.company.Tasks.Task_4.Class_Inf;

public class Ship {
    private int count;
    private final Size size;

    public Ship(Size size) {
        this.size = size;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        return count < size.getValue();
    }

    public int getCount() {
        return count;
    }

    public Size getSize() {
        return size;
    }
}
