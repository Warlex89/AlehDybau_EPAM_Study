//Вычислить значения функции на отрезке [а,b] c шагом h:
package com.company.Basics.Task_13;
import java.util.Scanner;
import static java.lang.System.*;

public class Task13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите значение а");
        int a = sc.nextInt();
        out.println("Введите значение b");
        int b = sc.nextInt();
        out.println("Введите значение h");
        int h = sc.nextInt();
        out.println("Введите значение x");
        int x = sc.nextInt();
        int y = 0;
        for(int i = a; i<=b; i+=h){
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
        }
        out.println("Значение функции y = "+y);
    }
}
