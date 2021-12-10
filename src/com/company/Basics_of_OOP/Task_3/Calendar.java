package com.company.Basics_of_OOP.Task_3;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Calendar {
    private ArrayList<Holiday> holidays;
    private ArrayList<Weekend> weekends;

    public Calendar(int year) {
        this.holidays = new ArrayList<>();
        this.weekends = new ArrayList<>();
        addWeekend(year);
    }

    private void addWeekend(int year){
        LocalDate localDate = LocalDate.of(year,1,1);
        while (localDate.getYear() == year){
            if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY){
                weekends.add(new Weekend(localDate,"Суббота"));
                localDate = localDate.plusDays(1);
            }
            if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY){
                weekends.add(new Weekend(localDate,"Воскресение"));
                localDate = localDate.plusDays(1);
            }
            if (localDate.getDayOfWeek() != DayOfWeek.SATURDAY
            && localDate.getDayOfWeek() != DayOfWeek.SUNDAY){
                localDate = localDate.plusDays(1);
            }
        }
    }

    public void addHoliday(LocalDate holiday, String nameOfHoliday){
        holidays.add(new Holiday(holiday,nameOfHoliday));
    }

    public void printAllHolidays(){
        holidays.sort(Comparator.comparing(Holiday::getDate).thenComparing(Holiday::getNameOfHoliday));
        holidays.forEach(System.out::println);
    }

    public void printAllWeekends(){weekends.forEach(System.out::println);}

    public void removeHoliday(String nameHoliday){
        boolean non = true;
        for (int i = 0; i < holidays.size(); i++){
            if(holidays.get(i).getNameOfHoliday().compareToIgnoreCase(nameHoliday.trim()) == 0){
                holidays.remove(holidays.get(i));
                System.out.println("Указанный праздник удалён из календаря");
                non = false;
            }
        }
        if(non) System.out.println("Такого праздника нет в вашем календаре");
    }

    class Holiday extends Day{
        private String nameOfHoliday;

        public Holiday(LocalDate holyDate, String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
            this.setDate(holyDate);
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return getDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " - " + nameOfHoliday;
        }
    }

    class Weekend extends Day{
        private String nameOfWeekend;

        public Weekend(LocalDate weekend, String nameOfWeekend) {
            this.nameOfWeekend = nameOfWeekend;
            this.setDate(weekend);
        }

        @Override
        public String toString() {
            return getDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " - " + nameOfWeekend;
        }
    }
}
