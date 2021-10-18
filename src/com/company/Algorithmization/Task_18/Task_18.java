package com.company.Algorithmization.Task_18;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task_18 {
    public static void main(String[] args) {
        int n, m, z1 = 0, z2 = 0, st1, st2, array[][], l;
        out.println("Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        Scanner sc = new Scanner(in);
        out.println("Введите высоту матрицы ");
        n = sc.nextInt();
        out.println("Введите ширину матрицы ");
        m = sc.nextInt();
        array = new int[n][m];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
                array[i][j] = l;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        out.println("Введите первый столбец, который нужно заменить ");
        st1 = sc.nextInt();
        out.println("Введите второй столбец ");
        st2 = sc.nextInt();
        if (st2 > st1){//если второй столбец, введённый пользователем, больше первого и в диапазоне m
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++){
                    if(j == st1 - 1) z1 = array[i][j];
                    if(j == st2 - 1) {
                        z2 = array[i][j];
                        array[i][j] = z1;
                    }
                }
                for (int j = 0; j < m; j++){
                    if (j == st1 -1) array[i][j] = z2;
                    out.print(" "+ array[i][j]+ " ");
                }
                out.println();
            }
        }
        if(st1 > st2){//если первый столбец, введённый пользователем, больше второго и в диапазоне m
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if(j == st1 - 1) z1 = array[i][j];
                }
                for(int j = 0; j < m; j++){
                    if(j == st2 - 1){
                        z2 = array[i][j];
                        array[i][j] = z1;
                    }if(j == st1 - 1) array[i][j] = z2;
                    out.print(" "+ array[i][j]+ " ");
                }
                out.println();
            }
        }
        if(st1 == st2){
            out.println("Столбец сам с собой не поменяешь! Попробуй еще раз.");
        }
    }
}
