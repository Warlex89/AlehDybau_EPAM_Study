package com.company.String.Task_3;
import java.util.Scanner;
import static java.lang.System.*;

public class Task3 {
    public static void main(String[] args){
        out.println("В строке найти количество цифр.");
        String letter = inputLetter();
        out.println("Первоначальное предложение: "+letter);
        out.println("Количество цифр в предложении "+counter(letter));

    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение ");
        return sc.nextLine();
    }
    public static int counter (String letter){
        int count = 0;
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < letter.length(); i++){
            for (int number : numbers){
                if (letter.charAt(i) == number) {
                    ++count;
                }
            }
        }
        return count;
    }
}
