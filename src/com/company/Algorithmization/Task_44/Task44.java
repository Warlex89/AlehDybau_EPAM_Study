package com.company.Algorithmization.Task_44;
import java.util.*;

import static java.lang.System.*;

public class Task44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.");
        out.println("Введите натуральное число ");
        int n = sc.nextInt();
        out.println("Получены следующие цифры "+numbers(n));
    }
    public static List<Integer> numbers (int n){
        List<Integer> arNmb = new ArrayList<>();
        for (; n > 0; n/=10){
            int x = n%10;
            arNmb.add(x);
        }
        Collections.sort(arNmb);
        return arNmb;
    }
}
