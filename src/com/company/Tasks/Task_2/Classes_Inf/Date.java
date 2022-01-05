package com.company.Tasks.Task_2.Classes_Inf;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private final LocalDate day;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Date(String day) {
        this.day = LocalDate.parse(day, dtf);
    }

    public String getDay() {
        return day.format(dtf);
    }
}
