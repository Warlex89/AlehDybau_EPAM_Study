package com.company.Classes.Task_11;
import java.util.ArrayList;

public class Text {
    public String heading;
    public ArrayList<Sentence> text;

    public Text(String heading) {
        this.heading = heading;
        this.text = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        this.text.add(sentence);
    }

    public void printHeading(){
        System.out.println(this.heading);
    }

    public void printText(){
        this.text.forEach(System.out::println);
    }
}
