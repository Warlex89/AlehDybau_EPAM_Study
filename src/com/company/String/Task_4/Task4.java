package com.company.String.Task_4;
import java.util.Scanner;
import static java.lang.System.*;

public class Task4 {
    public static void main(String[] args){
        String letter = inputLetter();
        out.println("Первоначальное предложение: "+letter);
        out.println("Количество чисел в предложении "+counterNumber(letter));

    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение ");
        return sc.nextLine();
    }
    public static int counterNumber(String letter){
        int count = 0;
        for (int i = 0; i < letter.length(); i++){
                if (isNum(letter.charAt(i))){
                    if ( i == letter.length() - 1 || !isNum(letter.charAt(i+1))){
                        count++;
                    }
                }
        }
        return count;
    }
    public static boolean isNum (char word){
        boolean isNumber = false;
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        for (int number : numbers){
            if (number == word) isNumber = true;
        }
        return isNumber;
    }
}
