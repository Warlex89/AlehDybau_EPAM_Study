package com.company.Classes.Task_11;

public record Word(String word) {

    public String getWord() { return word; }

    @Override
    public String toString() { return word;}
}
