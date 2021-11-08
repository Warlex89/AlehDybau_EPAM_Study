package com.company.String.Task_11;
import java.util.Scanner;
import static java.lang.System.*;

public class Task11 {
    public static void main(String[] args){
        out.println("Из заданной строки получить новую, повторив каждый символ дважды.");
        String sentence = inputLetter();
        out.println("Первоначальное предложение: "+sentence);
        out.println("Итоговое предложение: "+makeSentence(sentence));

    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите строку ");
        return sc.nextLine();
    }
    public static String makeSentence(String sentence){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++){
            stringBuilder.append(sentence.charAt(i));
            stringBuilder.append(sentence.charAt(i));
        }
        return stringBuilder.toString();
    }
}
