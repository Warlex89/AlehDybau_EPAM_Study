package com.company.String.Task_15;
import java.util.Scanner;
import static java.lang.System.*;

public class Task15 {
    public static void main(String[] args){
        out.println("Определить количество предложений в строке X.");
        String sentence = inputLetter();
        out.println("Введена строка: "+sentence);
        out.println("Количество предложений: "+countSentences(sentence));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите строку ");
        return sc.nextLine();
    }
    public static int countSentences(String sentence){
        int counter = 1;
        char[] marks = {'.','!','?'};
        for (int i = 0; i < sentence.length()-1; i++){
            for (char mark:marks){
                if(sentence.charAt(i) == mark && sentence.charAt(i+1) == ' ') counter++;
            }
        }
        return counter;
    }
}
