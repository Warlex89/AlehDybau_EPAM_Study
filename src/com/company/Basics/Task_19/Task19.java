//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
package com.company.Basics.Task_19;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Task19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите значение числа a ");
        int a = sc.nextInt();
        out.println("Введите значение числа b ");
        int b = sc.nextInt();
        out.println("Цифры числа а = "+numbers(a));
        out.println("Цифры числа а = "+numbers(b));

    }
    public static ArrayList numbers(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            int i = 0;
            array.add(i,a%10);
            a = a/10;
            i++;
        }while (a>0);
        return array;
    }
}
