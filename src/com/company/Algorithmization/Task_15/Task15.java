package com.company.Algorithmization.Task_15;
import java.util.Scanner;
import static java.lang.System.*;

public class Task15 {
    public static void main(String[] args) {
        int n;
        int k = 1;
        int[][] array;
        out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        Scanner sc = new Scanner(in);
        out.println("Введите размер матрицы ");
        n = sc.nextInt();
        array = new int[n][n];
        out.println("Получена искомая матрица ");
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++){
                    array[i][j] = n - (n-k);
                    out.print(" " + array[i][j] + " ");
                }
                for(int j = n - i; j < n; j++){
                    array[i][j] = 0;
                    out.print(" " + array[i][j] + " ");
                }
            k++;
            out.println();
        }
    }
}
