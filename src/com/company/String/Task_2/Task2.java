package com.company.String.Task_2;
import java.util.Scanner;
import static java.lang.System.*;

public class Task2 {
    public static void main(String[] args){
        out.println("Замените в строке все вхождения 'word' на 'letter'.");
        String letter = inputLetter();
        String resultLetter = finalLetter(letter);
        out.println("Первоначальное предложение: "+letter);
        out.println("Предложение, полученное в результате: "+resultLetter);
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение, содержашее word ");
        return sc.nextLine();
    }
    public static String finalLetter(String letter){
        StringBuilder stringBuilder = new StringBuilder();
        String finalLetter;
        for (int i = 0; i < letter.length(); i++){
            if (letter.charAt(i) == 'w'
                    && letter.charAt(i+1) == 'o'
                    && letter.charAt(i+2) == 'r'
                    && letter.charAt(i+3) == 'd'){
                stringBuilder.append("letter");
                i+=3;
            }else{
                stringBuilder.append(letter.charAt(i));
            }
        }
        finalLetter = stringBuilder.toString();
        return finalLetter;
    }
}
