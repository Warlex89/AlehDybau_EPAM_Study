//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
package com.company.Basics.Task_2;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Укажите значение переменной a ");
        double a = sc.nextInt();
        out.println("Укажите значение переменной b ");
        double b = sc.nextInt();
        out.println("Укажите значение переменной c ");
        double c = sc.nextInt();
        double z = (b + sqrt(pow(b,2) + 4 * a * c)) / (2 * a) - (pow(a,3) * c) + pow(b,-2);
        out.println("Значение уравнения z = "+z);
    }
}
