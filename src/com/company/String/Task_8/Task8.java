package com.company.String.Task_8;
import java.util.Scanner;
import static java.lang.System.*;

public class Task8 {
    public static void main(String[] args){
        out.println("Проверить, является ли заданное слово палиндромом");
        String word = inputLetter();
        out.println("Слово "+word+isPalindrome(word));
    }

    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите слово ");
        return sc.nextLine();
    }
    public static String isPalindrome (String word){
        boolean isPal = true;
        for (int i = 0; i < word.length() / 2; i++){
            String x = String.valueOf(word.charAt(i));
            String y = String.valueOf(word.charAt(word.length() - i - 1));
            isPal = (x.equalsIgnoreCase(y)) ? true : false;
        }
        String resPal = (isPal) ? " - палиндром" : " - не палиндром";
        return resPal;
    }
}
