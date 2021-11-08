package com.company.String.Task_9;
import static java.lang.System.*;

public class Task9 {
    public static void main(String[] args){
        String word = "информатика";
        out.println(createWord(word));
    }
    public static String createWord(String word){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word.charAt(7));
        stringBuilder.append(word.charAt(3));
        stringBuilder.append(word.charAt(4));
        stringBuilder.append(word.charAt(7));
        return stringBuilder.toString();
    }
}
