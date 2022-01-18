package com.company.Algorithmization.Task_11;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task11 {
    public static void main(String[] args) {
        int n, m, l;
        int[][] array;
        out.println("Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего");
        Scanner sc = new Scanner(in);
        out.println("Введите размер высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array = new int[n][m];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j< m; j++ ){
            l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
            array[i][j] = l;
                out.print(" "+array[i][j]+" ");
            }
            out.println();
        }
        out.println("Получены следующие столбцы ");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j % 2 == 1 & array[0][j] > array[n-1][j]) out.print(" "+array[i][j]+" ");
            }
            out.println();
        }
    }
}
