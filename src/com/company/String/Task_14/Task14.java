package com.company.String.Task_14;
import java.util.Scanner;
import static java.lang.System.*;

public class Task14 {
    public static void main(String[] args){
        out.println("Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке");
        String sentence = inputLetter();
        out.println("Введена строка: "+sentence);
        out.println("Количество строчных букв: "+countLowCase(sentence));
        out.println("Количество прописных букв: "+countUpCase(sentence));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите строку ");
        return sc.nextLine();
    }
    public static int countLowCase (String sentence){
        int lowCase = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (Character.isLowerCase(sentence.charAt(i))) lowCase++;
        }
        return lowCase;
    }
    public static int countUpCase (String sentence){
        int upCase = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (Character.isUpperCase(sentence.charAt(i))) upCase++;
        }
        return upCase;
    }
}
