package com.company.String.Task_13;
import java.util.Scanner;
import static java.lang.System.*;

public class Task13 {
    public static void main(String[] args){
        out.println("Найти самое длинное слово и вывести его на экран");
        String sentence = inputLetter();
        out.println("Введена строка слов: "+sentence);
        out.println("Самое длинное слово: "+longestWord(sentence));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите строку слов ");
        return sc.nextLine();
    }
    public static String longestWord (String words){
        String lonWord = "";
        int maxCount = 0;
        String[] wordArray = words.split(" ");
        for (String s : wordArray) {
            if (s.length() > maxCount) {
                maxCount = s.length();
                lonWord = s;
            }
        }
        return lonWord;
    }
}
