package com.company.Algorithmization.Task_37;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;
import java.text.DecimalFormat;

public class Task37 {
    public static void main(String[] args){
        Task37 tsk = new Task37();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(in);
        out.println("Введите длину стороны шестиуголника ");
        double a = sc.nextInt();
        String result = decimalFormat.format(6 * tsk.TriangleSquare(a));
        out.println("Площадь правильного шестиуголника равна "+result);
    }
    public static double TriangleSquare(double a){
        double sQ = sqrt(3)/4*pow(a,2);
        return sQ;
    }
}
