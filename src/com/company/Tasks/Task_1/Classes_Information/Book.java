package com.company.Tasks.Task_1.Classes_Information;

public class Book {
    private final String author;
    private final String title;
    private final int year;
    private TypeOfBook type;

    public Book(String author, String title, int year, TypeOfBook type) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public TypeOfBook getType() {
        return type;
    }

    public void setType(TypeOfBook type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return author + " - " + title + " - " + year + " - " + type.getName();
    }
}
