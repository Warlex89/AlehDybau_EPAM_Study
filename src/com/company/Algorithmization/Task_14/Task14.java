package com.company.Algorithmization.Task_14;
import java.util.Scanner;
import static java.lang.System.*;

public class Task14 {
    public static void main(String[] args) {
        int n, k, array[][];
        out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        Scanner sc = new Scanner(in);
        out.println("Введите размер матрицы ");
        n = sc.nextInt();
        array = new int[n][n];
        out.println("Получена искомая матрица ");
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                k = 1;
                 for (int j = 0; j < n; j++){
                     array[i][j] = k;
                     k++;
                     out.print(" " + array[i][j] + " ");
                 }
            }
            else{
                k = 0;
                for (int j = 0; j < n; j++){
                    array[i][j] = n - k;
                    k++;
                    out.print(" " + array[i][j] + " ");
                }
            }
            out.println();
        }
    }
}
