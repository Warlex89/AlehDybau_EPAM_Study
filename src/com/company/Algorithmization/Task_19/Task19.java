package com.company.Algorithmization.Task_19;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task19 {
    public static void main(String[] args) {
        int n, m, array1[][], array2[],l, maxValue = 0, st = 0;
        out.println("Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой\n" +
                "столбец содержит максимальную сумму.");
        Scanner sc = new Scanner(in);
        out.println("Введите высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array1 = new int[n][m];
        array2 = new int[m];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
                array1[i][j] = l;
                out.print(" " + array1[i][j] + " ");
                array2[j] = array2[j]+array1[i][j];
            }
            out.println();
        }
        for (int i = 0; i < m; i++){
            st = (array2[i] > maxValue) ? i+1: st;
            maxValue = max(maxValue, array2[i]);
        }
        out.println("Массив сумм "+ Arrays.toString(array2));
        out.println("Максимальная сумма = "+maxValue+" в столбце "+st);
    }
}
