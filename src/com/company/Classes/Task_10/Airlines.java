package com.company.Classes.Task_10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Airlines {
    public String destination;
    public int number;
    public String typeOfPlane;
    public Date departureTime;
    public Date daysOfTheWeek;
    public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    public static SimpleDateFormat dow = new SimpleDateFormat("EEEE", Locale.ENGLISH);

    public Airlines(String destination, int number, String typeOfPlane,
                    String departureTime, String daysOfTheWeek) throws ParseException {
        this.destination = destination;
        this.number = number;
        this.typeOfPlane = typeOfPlane;
        this.departureTime = sdf.parse(departureTime);
        this.daysOfTheWeek = dow.parse(daysOfTheWeek);
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "destination = '" + destination + '\'' +
                ", number = " + number +
                ", typeOfPlane = '" + typeOfPlane + '\'' +
                ", departureTime = " + sdf.format(departureTime) +
                ", daysOfTheWeek = " + dow.format(daysOfTheWeek) +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(Date daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

}
