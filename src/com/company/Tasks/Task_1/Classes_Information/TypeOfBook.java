package com.company.Tasks.Task_1.Classes_Information;

public enum TypeOfBook {
    REALISM("реализм"),
    SCIENCE("научная фантастика"),
    FANTASY("фэнтези"),
    HORROR("ужасы"),
    LOVE("любовный роман"),
    ADVENTURE("приключение"),
    NON("Жанр не найден");
    private final String name;

    TypeOfBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
