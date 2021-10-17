package com.company.Algorithmization.Task_17;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task17 {
    public static void main(String[] args) {
        int n, count = 0;
        out.println("Сформировать квадратную матрицу порядка N по правилуи подсчитать количество положительных элементов в ней. ");
        Scanner sc = new Scanner(in);
        out.println("Введите размер матрицы ");
        n = sc.nextInt();
        double[][] array = new double[n][n];
        out.println("Получена требуемая матрица ");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                array[i][j] = ((sin(sqrt(i)-sqrt(j))/n));
                count = (array[i][j] > 0) ? ++count : count;
                String result = decimalFormat.format(array[i][j]); // округляем элемент до 2-х знаков после запятой
                out.print(" " + result + " ");
            }
            out.println();
        }
        out.println("Количество положительных элементов = "+count);
    }
}
