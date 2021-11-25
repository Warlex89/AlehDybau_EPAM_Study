package com.company.Classes.Task_13;

public record Region(String name, District mainDistrict, int area) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public District mainDistrict() {
        return mainDistrict;
    }

    @Override
    public int area() {
        return area;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", mainDistrict=" + mainDistrict +
                ", area=" + area +
                '}';
    }
}
