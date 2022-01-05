package com.company.Tasks.Task_2.Classes_Inf;

public record Message(String text) {
    @Override
    public String toString() {
        return text;
    }
}
