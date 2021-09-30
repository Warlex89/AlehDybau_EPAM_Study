//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
package com.company.Basics.Task_1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите значение переменной a ");
        int a = sc.nextInt();
        System.out.println("Укажите значение переменной b ");
        int b = sc.nextInt();
        System.out.println("Укажите значение переменной c ");
        int c = sc.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции z = "+z);
    }
}
