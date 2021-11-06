package com.company.String.Task_5;
import java.util.Scanner;
import static java.lang.System.*;

public class Task5 {
    public static void main(String[] args){
        out.println("Удалить в строке все лишние пробелы," +
                " то есть серии подряд идущих пробелов заменить на одиночные пробелы.\n" +
                "Крайние пробелы в строке удалить.");
        String letter = inputLetter();
        out.println("Первоначальное предложение:"+letter);
        out.println("Предложение после редактирования:"+deleteSpace(letter));
    }
    public static String inputLetter (){
        Scanner sc = new Scanner(in);
        out.println("Введите предложение ");
        return sc.nextLine();
    }
    public static String deleteSpace (String letter){
        String let = letter.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < let.length(); i++){
            if (let.charAt(i) == ' '){
                if (i == let.length() - 1 || let.charAt(i -1 ) == ' ') i+=1;
                else stringBuilder.append(let.charAt(i));
            }else stringBuilder.append(let.charAt(i));
        }
        let = stringBuilder.toString();
        return let;
    }
}
