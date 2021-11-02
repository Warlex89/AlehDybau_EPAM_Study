package com.company.Algorithmization.Task_46;
import java.util.*;
import static java.lang.System.*;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.");
        out.println("Введите первое число ");
        int n = sc.nextInt();
        out.println("Введите второе число ");
        int m = sc.nextInt();
        out.println("Получен следующий массив "+numbers(n, m));
    }
    public static List<Integer> numbers (int n, int m){
        List<Integer> arNmb = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            int sum = 0;
            for (int j = i; j > 0; j/=10) sum += j%10;
            if (sum == n) arNmb.add(i);
        }
        Collections.sort(arNmb);
        return arNmb;
    }

}
