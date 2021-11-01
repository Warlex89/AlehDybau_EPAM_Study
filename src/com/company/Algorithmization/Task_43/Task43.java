package com.company.Algorithmization.Task_43;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Scanner;


public class Task43 {
    public static void main(String[] args){
        int t,x,y,z;
        out.println("Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,\n" +
                "если угол между сторонами длиной X и Y— прямой.");
        Scanner sc = new Scanner(in);
        out.println("Введите значение стороны X ");
        x = sc.nextInt();
        out.println("Введите значение стороны Y ");
        y = sc.nextInt();
        out.println("Введите значение стороны Z ");
        z = sc.nextInt();
        out.println("Введите значение стороны T ");
        t = sc.nextInt();
        out.println("Площадь прямоуголника равна "+ square(x, y, z, t));
    }
    public static int square(int x, int y, int z, int t){
        int s1 = (x*y)/2;// площадь треуголника с прямым углом
        int c = (int) sqrt(pow(x,2)+pow(y,2)); // гипотенуза
        int p = (z+t+c)/2; //полупериметр второго треуголника
        int s2 = (int) sqrt(p*(p-z)*(p-t)*(p-c)); // формула Герона
        return s1 + s2;
    }
}

