package com.company.Algorithmization.Task_23;
import com.company.Algorithmization.Task_22.Task22;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task23 {public static void main(String[] args) {
    int n, m, array[][], l;
    Task23 task23 = new Task23();
    boolean needIteration = true;
    out.println("Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.");
    Scanner sc = new Scanner(in);
    out.println("Введите высоту матрицы ");
    n = sc.nextInt();
    out.println("Введите ширину матрицы ");
    m = sc.nextInt();
    array = new int[n][m];
    out.println("Получена следующая матрица ");
    // Заполняем матрицу случайными числами
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            l = (int) (random() * n);
            array[i][j] = l;
            out.print(" " + array[i][j] + " ");
        }
        out.println();
    }
    // производим сортировку столбцов матрицы по возрастанию
    while (needIteration) {
        needIteration = false;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(i >= 1 && array[i][j] < array[i- 1][j ]){
                    int k = array[i][j];
                    array[i][j] = array[i-1][j];
                    array[i-1][j] = k;
                    needIteration = true;
                }
            }
        }
    }
    needIteration = true;
    // выводим полученную матрицу
    out.println("В результате сортировки получена следующая матрица (по возрастанию) ");
    task23.printMatrix(array,n ,m);
    // производим сортировку столбцов матрицы по убыванию
    while (needIteration) {
        needIteration = false;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(i >= 1 && array[i][j] > array[i- 1][j]){
                    int k = array[i][j];
                    array[i][j] = array[i- 1][j];
                    array[i- 1][j] = k;
                    needIteration = true;
                }
            }
        }
    }
    out.println("В результате сортировки получена следующая матрица (по убыванию) ");
    task23.printMatrix(array,n ,m);
}
    // метод для вывода матрицы
    public void printMatrix(int[][] array2, int n2, int m2){
        for (int i = 0; i < n2; i++){
            for (int j = 0; j < m2; j++){
                out.print(" " + array2[i][j] + " ");
            }
            out.println();
        }
    }
}
