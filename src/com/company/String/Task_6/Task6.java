package com.company.String.Task_6;
import java.util.Scanner;
import static java.lang.System.*;

public class Task6 {
    public static void main(String[] args){
        out.println("Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем");
        String sentence = inputLetter();
        out.println("Введено предложение: "+sentence);
        out.println("Найдите наибольшее количество подряд идущих пробелов: "+countSpace(sentence));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение ");
        return sc.nextLine();
    }
    public static int countSpace(String sentence){
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }else{
                if(count > countMax){
                    countMax = count;
                }
                count = 0;
            }
        }
        return countMax;
    }
}
