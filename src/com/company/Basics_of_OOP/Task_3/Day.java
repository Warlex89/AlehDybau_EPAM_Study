package com.company.Basics_of_OOP.Task_3;
import java.time.LocalDate;

abstract class Day {
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
