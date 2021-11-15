package com.company.Classes.Task_1;

public class Task1 {
    private int x = 1;
    private int y = 1;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void onDesktopX(){
        System.out.println("Значение х равно " + x);
    }

    public void onDesktopY(){
        System.out.println("Значение у равно " + y);
    }

    public int getSum(){
        return x + y;
    }

    public int getMaxValue(){
        return Math.max(x,y);
    }
}
