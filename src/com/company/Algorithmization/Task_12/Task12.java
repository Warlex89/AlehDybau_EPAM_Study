package com.company.Algorithmization.Task_12;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task12 {
    public static void main(String[] args) {
        int n, array[][], l;
        out.println("Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");
        Scanner sc = new Scanner(in);
        out.println("Введите размер квадратной матрицы ");
        n = sc.nextInt();
        array = new int[n][n];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
                array[i][j] = l;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        out.println("Элементы стоящие на диагонали ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ( i == j){
                    out.print(" "+array[i][j]+" ");
                }else out.print("   ");
            }
            out.println();
        }
    }
}
