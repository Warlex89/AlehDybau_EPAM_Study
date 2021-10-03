/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным*/
package com.company.Basics.Task_7;
import java.util.Scanner;
import static java.lang.System.*;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Задайте угуол а ");
        int a = sc.nextInt();
        out.println("Задайте угол b ");
        int b = sc.nextInt();
        if(180>a+b){
            out.print("Треугольник существует");
            if(a+b==90){
                out.println(" и он прямоугольный");
            }else{out.println(", но он не прямоугольный");}
        }else{
            out.println("Такого треугольника не бывает");
        }
    }
}
