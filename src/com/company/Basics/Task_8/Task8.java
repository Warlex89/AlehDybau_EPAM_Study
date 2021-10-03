// Найти max{min(a, b), min(c, d)}
package com.company.Basics.Task_8;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Задайте значение а ");
        int a = sc.nextInt();
        out.println("Задайте значение b ");
        int b = sc.nextInt();
        out.println("Задайте значение с ");
        int c = sc.nextInt();
        out.println("Задайте значение d ");
        int d = sc.nextInt();
        int result = max(min(a,b),min(c,d));
        out.println("Результат сравнения "+result);
    }
}
