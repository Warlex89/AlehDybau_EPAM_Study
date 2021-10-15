package com.company.Algorithmization.Task_13;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task13 {
    public static void main(String[] args) {
        int n, m, k, p, array[][], l;
        out.println("Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        Scanner sc = new Scanner(in);
        out.println("Введите высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array = new int[n][m];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
                array[i][j] = l;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        out.println("Вывести строку k ");
        k = sc.nextInt();
        out.println("Вывести столбец p ");
        p = sc.nextInt();
        out.println("Получены следующие числа ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if ((i+1) == k || (j+1) == p) out.print(" "+array[i][j]+" ");
                else out.print("   ");
            }
            out.println();
        }
    }
}
