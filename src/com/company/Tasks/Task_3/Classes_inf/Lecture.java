package com.company.Tasks.Task_3.Classes_inf;

public class Lecture extends Human{
    public static final String RED = "\u001B[31m";
    AcademicTitle academicTitle;

    public Lecture(String name, String surname, AcademicTitle academicTitle) {
        super(name, surname, "Преподаватель");
        this.academicTitle = academicTitle;
    }

    public AcademicTitle getAcademicTitle() {
        return academicTitle;
    }

    @Override
    public String toString() {
        return RED + "Преподаватель: " + RESET + academicTitle.getAcTitle()+ " " + name + " " + surname;
    }
}
