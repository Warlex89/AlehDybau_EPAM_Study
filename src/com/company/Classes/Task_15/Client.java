package com.company.Classes.Task_15;

public class Client {
    private final String name;
    private final String surname;
    TourPackage tour;

    public Client(String name, String surname, TourPackage tour) {
        this.name = name;
        this.surname = surname;
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tour=" + tour +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public TourPackage getTour() {
        return tour;
    }

    public void setTour(TourPackage tour) {
        this.tour = tour;
    }
}
