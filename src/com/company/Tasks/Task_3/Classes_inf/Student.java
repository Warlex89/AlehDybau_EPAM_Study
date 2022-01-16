package com.company.Tasks.Task_3.Classes_inf;

public class Student extends Human{
    private static final String GREEN = "\u001B[32m";
    int yearOfStudy;
    Faculties faculty;
    int avScore;

    public Student(String name, String surname, int yearOfStudy, Faculties faculty, int avScore) {
        super(name, surname, "Студент");
        this.status = "Студент";
        this.yearOfStudy = yearOfStudy;
        this.faculty = faculty;
        this.avScore = avScore;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public int getAvScore() {
        return avScore;
    }

    @Override
    public String toString() {
        return GREEN + "Студент: " + RESET + name + " " + surname + ", год обучения - " + yearOfStudy +
                ", факультет - " + faculty.getFaculty() +
                ", средний балл = " + avScore;
    }
}
