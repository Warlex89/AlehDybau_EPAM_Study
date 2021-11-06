package com.company.String.Task_1;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args){
        out.println("Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.");
        String[] camelCase = inputCamelCase();
        String [] snakeCase = toSnakeCase(camelCase);
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
    public static String[] inputCamelCase (){
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива camelCase ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] camelCase = new String[n];
        for (int i = 0; i < n; i++){
            out.println("Введите название переменной "+i);
            camelCase[i] = sc.nextLine();
        }
        return camelCase;
    }
    public static String[] toSnakeCase(String[] camelcase){
        String[] snakeCase = new String[camelcase.length];
        for (int i = 0; i < camelcase.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelcase[i].length(); j++){
                char let = camelcase[i].toCharArray()[j];
                if(Character.isLowerCase(let)){
                    stringBuilder.append(let);
                }else{
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(let));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
