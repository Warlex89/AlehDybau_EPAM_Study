// Вычислить значение функции
package com.company.Basics.Task_11;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task11 {
    public static void main(String[] args){
        double f = 0;
        Scanner sc = new Scanner(in);
        out.println("Введите значение x ");
        double x = sc.nextDouble();
        if(x<=3){
            f = pow(x,2) - 3*x + 9;
            out.println("Значение функции F(x)="+f);
        }else{
            f = 1/(pow(x,3) + 6);
            out.println("Значение функции F(x)="+f);
        }
    }
}
