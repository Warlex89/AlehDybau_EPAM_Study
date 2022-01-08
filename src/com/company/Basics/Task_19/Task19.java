//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
package com.company.Basics.Task_19;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.*;

public class Task19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите значение числа a ");
        int a = sc.nextInt();
        out.println("Введите значение числа b ");
        int b = sc.nextInt();
        ArrayList<Integer> numOfA = numbers(a), numOfB = numbers(b), res = new ArrayList<>();
        for(Integer num : numOfA){
            for (Integer integer : numOfB) {
                if (Objects.equals(num, integer)) {
                    res.add(num);
                    break;
                }
            }
        }
        out.println("Общие цифры для двух чисел: "+res);
    }
    public static ArrayList<Integer> numbers(int a){
        ArrayList<Integer> array = new ArrayList<>();
        int i = 0;
        do{
            array.add(i,a%10);
            a = a/10;
            i++;
        }while (a>0);
        return array;
    }
}
