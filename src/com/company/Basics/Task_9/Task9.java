// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
package com.company.Basics.Task_9;
import java.util.Scanner;
import static java.lang.System.*;

public class Task9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Задайте значение точки A x1 ");
        int x1 = sc.nextInt();
        out.println("Задайте значение точки A y1 ");
        int y1 = sc.nextInt();
        out.println("Задайте значение точки B x2 ");
        int x2 = sc.nextInt();
        out.println("Задайте значение точки B y2 ");
        int y2 = sc.nextInt();
        out.println("Задайте значение точки C x3 ");
        int x3 = sc.nextInt();
        out.println("Задайте значение точки C y3 ");
        int y3 = sc.nextInt();
        if((x3-x1)*(y2-y1)==(y3-y1)*(x2-x1)){
            out.println("Точки находятся на одной линии");
        }else{
            out.println("Точки не находятся на одной линии");
        }
    }
}
