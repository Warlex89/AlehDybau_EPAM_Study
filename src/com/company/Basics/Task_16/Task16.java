/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид*/
package com.company.Basics.Task_16;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите значение числового ряда ");
        double n = sc.nextDouble();
        out.println("Введите значение е ");
        double e = sc.nextDouble();
        double a, sum = 0;
        for(int i=0; i<=n; i++){
            a = 1/pow(2,i)+1/pow(3,i);
            if(abs(a)>=e){
               sum+=a;
            }
        }
        out.println(sum);
    }
}
