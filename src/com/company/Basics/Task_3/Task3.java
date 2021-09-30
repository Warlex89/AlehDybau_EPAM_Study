//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
package com.company.Basics.Task_3;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Укажите значение переменной x ");
        double x = sc.nextInt();
        out.println("Укажите значение переменной y ");
        double y = sc.nextInt();
        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        out.println("Значение выражения z = "+z);
    }
}
