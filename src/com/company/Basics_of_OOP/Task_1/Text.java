package com.company.Basics_of_OOP.Task_1;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addText(String line){
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append('\n');
        this.text = stringBuilder.append(line).toString();
    }
}
