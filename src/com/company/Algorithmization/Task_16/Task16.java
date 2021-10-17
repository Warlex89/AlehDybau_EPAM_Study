package com.company.Algorithmization.Task_16;
import java.util.Scanner;
import static java.lang.System.*;

public class Task16 {
    public static void main(String[] args) {
        int n, array[][];
        out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        Scanner sc = new Scanner(in);
        out.println("Введите размер матрицы ");
        n = sc.nextInt();
        array = new int[n][n];
        out.println("Получена искомая матрица ");
        // алгоритм для первой половины матрицы
        for (int i = 0; i < n/2; i++) {
            for(int j = 0; j < n-(n-i); j++){
                array[i][j] = 0;
                out.print(" " + array[i][j] + " ");
            }
            for (int j = n-(n-i); j < n - i; j++){
                array[i][j] = 1;
                out.print(" " + array[i][j] + " ");
            }
            for(int j = n - i; j < n; j++){
                array[i][j] = 0;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        // алгоритм для второй половины матрицы
        int k = n/2-1;
        for (int i = 0; i < n/2; i++) {
            for(int j = 0; j < n-(n-k); j++){
                array[i][j] = 0;
                out.print(" " + array[i][j] + " ");
            }
            for (int j = n-(n-k); j < n - k; j++){
                array[i][j] = 1;
                out.print(" " + array[i][j] + " ");
            }
            for(int j = n - k; j < n; j++){
                array[i][j] = 0;
                out.print(" " + array[i][j] + " ");
            }
            k--;
            out.println();
        }
    }
}
