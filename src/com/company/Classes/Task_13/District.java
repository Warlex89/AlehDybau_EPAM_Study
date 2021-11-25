package com.company.Classes.Task_13;

public record District(City city) {
    @Override
    public String toString() {
        return String.format("Район с городом: %s", city.name());
    }

    @Override
    public City city() {
        return city;
    }
}
