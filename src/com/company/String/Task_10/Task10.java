package com.company.String.Task_10;
import static java.lang.System.*;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        out.println("Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.");
        String sentence = inputLetter();
        out.print("В предложении: "+sentence);
        out.println(" латинская буква “а” встречается: "+countA(sentence)+" раз(а)");
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите строку ");
        return sc.nextLine();
    }
    public static int countA (String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++)
            count = (sentence.charAt(i) == 'a') ? ++count : count;
        return count;
    }
}
