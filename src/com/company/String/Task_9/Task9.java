package com.company.String.Task_9;
import static java.lang.System.*;

public class Task9 {
    public static void main(String[] args){
        out.println("С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.");
        String word = "информатика";
        out.println(createWord(word));
    }
    public static String createWord(String word){
        return String.valueOf(word.charAt(7)) +
                word.charAt(3) +
                word.charAt(4) +
                word.charAt(7);
    }
}
