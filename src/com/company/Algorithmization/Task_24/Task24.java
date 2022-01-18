package com.company.Algorithmization.Task_24;
import java.util.Scanner;
import static java.lang.System.*;

public class Task24 {
    public static void main(String[] args) {
        int n, m;
        int[][] array2;
        String[][] array;
        boolean needIteration = true;
        out.println("Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.");
        Scanner sc = new Scanner(in);
        out.println("Введите высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array = new String[n][m];
        array2 = new int[n][m];
        out.println("Получена следующая матрица ");
        while (needIteration) {
            needIteration = false;
           for(int i = 0; i < n; i++){
               for (int j = 0; j < m; j++){
                   array[i][0] = "0";
                   if (j > 0 && array[i][j] == null){
                       array[i][j] = "1";
                       array2[i][j] += 1;
                       needIteration = true;
                   }
                   if (j > 0 && array[i][j] != null && array2[i][j] < j){
                       array[i][j] = array[i][j] + "1";
                       array2[i][j] += 1;
                       needIteration = true;
                   }
               }
           }
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(" "+array[i][j]+" ");
            }
            out.println();
        }
    }
}