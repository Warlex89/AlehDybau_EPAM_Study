package com.company.Tasks.Task_3.Classes_inf;

public enum Faculties {
    LECH("Лечебное дело"),
    PED("Педиатрический"),
    PSYCHO("Психиатрический");

    private final String faculty;

    Faculties(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
}
