package com.company.Algorithmization.Task_25;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task25 {
    public static void main(String[] args) {
        int n, m, l;
        int[][] array;
        int maxNumber = 0;
        out.println("Найдите наибольший элемент матрицы и заменить все нечетные элементы на него");
        Scanner sc = new Scanner(in);
        out.println("Введите высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array = new int[n][m];
        out.println("Получена следующая матрица ");
        // Заполняем матрицу случайными числами от 0 до n-1 и находим наибольший элемент матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                l = (int) (random() * n);
                array[i][j] = l;
                maxNumber = max(array[i][j],maxNumber);
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        out.println("После замены получена следующая матрица ");
        // производим замену нечётных чисел на наибольший элемент матрицы
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = (array[i][j] % 2 == 1) ? maxNumber : array[i][j];
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
    }
}
