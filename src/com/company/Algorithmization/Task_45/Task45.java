package com.company.Algorithmization.Task_45;
import java.util.*;
import static java.lang.System.*;

public class Task45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр");
        out.println("Введите первое число ");
        int x = sc.nextInt();
        out.println("Введите второе число ");
        int y = sc.nextInt();
        compareNumbers(x, y);
    }
    public static void compareNumbers(int x, int y){
        int xCount = numbersCount(x);
        int yCount = numbersCount(y);
        if( xCount > yCount) out.println("В числе "+x+" больше цифр");
        else {
            if (xCount < yCount) out.println("В числе "+y+" больше цифр");
            else out.println("В обеих числах одинаковое количество цифр");
        }
    }
    public static int numbersCount (int n){
        int count = 0;
        for (; n > 0; n/=10) count++;
        return count;
    }
}
