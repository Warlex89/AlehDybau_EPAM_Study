/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
package com.company.Basics.Task_4;
import java.util.Scanner;
import static java.lang.System.*;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Укажи значение изменяемой переменной х ");
        double x = sc.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        out.println(y);
    }

}
