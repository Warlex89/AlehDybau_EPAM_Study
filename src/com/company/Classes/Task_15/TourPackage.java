package com.company.Classes.Task_15;

public class TourPackage {
    public String country;
    public String city;
    public int numberOfDays;
    public TypeOfTur type;
    public Transport transport;
    public Food food;
    public int price;

    public TourPackage(String country, String city,
                       int numberOfDays, TypeOfTur type, Transport transport, Food food, int price) {
        this.country = country;
        this.city = city;
        this.numberOfDays = numberOfDays;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.price = price;
    }

    public TourPackage(TourPackage tour) {
        this.country = tour.country;
        this.city = tour.city;
        this.numberOfDays = tour.numberOfDays;
        this.type = tour.type;
        this.transport = tour.transport;
        this.food = tour.food;
        this.price = tour.price;
    }

    @Override
    public String toString() {
        return String.format("В данную туристическу путёвку включено: " +
                "посещение города %s в стране %s, колечество дней - %d, с целью %s, " +
                "транспорт - %s, питание - %s,стоимость путёвки - %d",
                city,country,numberOfDays,type,transport,food,price);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public TypeOfTur getType() {
        return type;
    }

    public void setType(TypeOfTur type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
