/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие*/
package com.company.Basics.Task_10;
import java.util.Scanner;
import static java.lang.System.*;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Задайте значение точки A");
        int a = sc.nextInt();
        out.println("Задайте значение точки B");
        int b = sc.nextInt();
        out.println("Задайте значение точки x");
        int x = sc.nextInt();
        out.println("Задайте значение точки y");
        int y = sc.nextInt();
        out.println("Задайте значение точки z");
        int z = sc.nextInt();
        if(a>x & b>y || a>x & b>z || a>y & b>z || b>x & a>y || b>x & a>z || b>y & a>z){
            out.println("Кирпич проходит через отверстие");
        }else{
            out.println("Кирпич не проходит через отверстие");
        }
    }
}
