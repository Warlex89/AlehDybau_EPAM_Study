package com.company.String.Task_7;
import java.util.Scanner;
import static java.lang.System.*;

public class Task7 {
    public static void main(String[] args){
        out.println("В строке вставить после каждого символа 'a' символ 'b'");
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
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a'){
                stringBuilder.append("ab");
            }else{
                stringBuilder.append(sentence.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}


