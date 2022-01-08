package com.company.Algorithmization.Task_37;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;
import java.text.DecimalFormat;

public class Task37 {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(in);
        out.println("Введите длину стороны шестиуголника ");
        double a = sc.nextInt();
        String result = decimalFormat.format(6 * TriangleSquare(a));
        out.println("Площадь правильного шестиуголника равна "+result);
    }
    public static double TriangleSquare(double a){
        return sqrt(3)/4*pow(a,2);
    }
}
