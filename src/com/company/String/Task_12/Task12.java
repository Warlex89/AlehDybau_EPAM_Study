package com.company.String.Task_12;
import java.util.Scanner;
import static java.lang.System.*;

public class Task12 {
    public static void main(String[] args){
        out.println("Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.");
        String sentence = inputLetter();
        out.println("Введено предложение: "+sentence);
        out.println("Получено следующее предложение: "+newSent(sentence));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение ");
        return sc.nextLine();
    }
    public static String newSent(String sentence){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sentence.charAt(0));
        for (int i = 1; i < sentence.length(); i++){
            boolean n = true;
            for (int j = 0; j < i;j++){
                if (sentence.charAt(i) == sentence.charAt(j)){
                    n = false;
                    break;
                }
            }
            if (n) stringBuilder.append(sentence.charAt(i));
        }
        return stringBuilder.toString();
    }
}
