/*Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.*/
package com.company.Basics.Task_12;
import java.util.Scanner;
import static java.lang.System.*;

public class Task12 {
    public static void main(String[] args){
        int x = 0;
        Scanner sc = new Scanner(in);
        out.println("Введи любой положительное целое число");
        int number = sc.nextInt();
        for(int i=1; i<=number; i++){
                x +=i;
        }
       out.println("Сумма чисел = "+x);
    }
}
