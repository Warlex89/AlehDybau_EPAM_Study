package com.company.Classes.Task_10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DateBaseOfAirlines {
    public ArrayList<Airlines> dataBase;

    public DateBaseOfAirlines(ArrayList<Airlines> dataBase) {
        this.dataBase = dataBase;
    }

    public void addAirlinesToDatabase(String destination, int number, String typeOfPlane,
                                      String departureTime, String daysOfTheWeek) throws ParseException {
        this.dataBase.add(new Airlines(destination,number,typeOfPlane,departureTime,daysOfTheWeek));
    }

    public void outByDestination(String destination){
        ArrayList<Airlines> list = new ArrayList<>();
        for( Airlines airline : this.dataBase){
            if (airline.getDestination().compareTo(destination) == 0){
                list.add(airline);
            }
        }
        list.forEach(System.out::println);
        if(list.size() == 0) System.out.println("В настоящее время в указанный пункт назначения нет рейсов");
    }

    public void outByDay(String day){
        ArrayList<Airlines> list = new ArrayList<>();
        for( Airlines airline : this.dataBase){
            String daysOfTheWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).
                    format(airline.getDaysOfTheWeek());
            if (daysOfTheWeek.compareTo(day) == 0){
                list.add(airline);
            }
        }
        list.forEach(System.out::println);
        if(list.size() == 0) System.out.println("В этот день нет рейсов");
    }

    public void outByComplexTime(String day, String time){
        ArrayList<Airlines> list = new ArrayList<>();
        for( Airlines airline : this.dataBase){
            String daysOfTheWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).
                    format(airline.getDaysOfTheWeek());
            String departureTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).
                    format(airline.getDepartureTime());
            if (daysOfTheWeek.compareTo(day) == 0 && departureTime.compareTo(time) > 0){
                list.add(airline);
            }
        }
        list.forEach(System.out::println);
        if(list.size() == 0) System.out.println("В этот день и в это время нет рейсов");
    }

    public ArrayList<Airlines> getDataBase() {
        return dataBase;
    }

    public void setDataBase(ArrayList<Airlines> dataBase) {
        this.dataBase = dataBase;
    }

}
