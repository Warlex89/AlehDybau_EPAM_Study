package com.company.Algorithmization.Task_20;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        Random random = new Random();
        int n, array[][], l, z;
        boolean st = true;
        out.println("Найти положительные элементы главной диагонали квадратной матрицы");
        Scanner sc = new Scanner(in);
        out.println("Введите размер квадратной матрицы ");
        n = sc.nextInt();
        z = n;
        array = new int[n][n];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                st = random.nextBoolean();
                if(st == false) z=(-z);
                l = (int) (random() * z);// создаётся случайное действительное число от -n< до <n для массива
                array[i][j] = l;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        out.println("Положительные элементы диагонали: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ( i == j & array[i][j] > 0){
                    out.print(" "+array[i][j]+" ");
                }
            }
        }
    }
}
