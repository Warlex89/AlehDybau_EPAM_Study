package com.company.Algorithmization.Task_22;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task22 {
    public static void main(String[] args) {
        int n, m, array[][], l;
        boolean needIteration = true;
        out.println("Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
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
        // производим сортировку матрицы по возрастанию
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) {
                    if(j >= 1 && array[i][j] < array[i][j - 1]){
                        int k = array[i][j];
                        array[i][j] = array[i][j-1];
                        array[i][j-1] = k;
                        needIteration = true;
                    }
                }
            }
        }
        needIteration = true;
        // выводим полученную матрицу
        out.println("В результате сортировки получена следующая матрица (по возрастанию) ");
        printMatrix(array,n ,m);
        // производим сортировку матрицы по убыванию
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) {
                    if(j >= 1 && array[i][j] > array[i][j - 1]){
                        int k = array[i][j];
                        array[i][j] = array[i][j-1];
                        array[i][j-1] = k;
                        needIteration = true;
                    }
                }
            }
        }
        out.println("В результате сортировки получена следующая матрица (по убыванию) ");
        printMatrix(array,n ,m);
    }
    // метод для вывода матрицы
    public static void printMatrix(int[][] array2, int n2, int m2){
        for (int i = 0; i < n2; i++){
            for (int j = 0; j < m2; j++){
                out.print(" " + array2[i][j] + " ");
            }
            out.println();
        }
    }
}
