package com.company.Algorithmization.Task_21;
import java.util.Arrays;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task21 {
    public static void main(String[] args) {
        int[] array2;
        int l;
        int sum1 = 0;
        int sum2;
        int str = 0;
        out.println("Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в\n" +
                "которых число 5 встречается три и более раз");
        int[][] array1 = new int[10][20];
        out.println("Получена следующая матрица ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                l = (int) (random() * 16);// создаётся случайное действительное число от 0 до 15 для массива
                array1[i][j] = l;
                if ((l == 5)) {
                    ++sum1;
                }
                out.print(" " + array1[i][j] + " ");
            }
            out.println();
            if (sum1 >= 3) str++;// считаем количество строк согласно заданию
            sum1 = 0;
        }
        array2 = new int[str];// массив для вывода номеров строк
        int k = 0;
        for (int i = 0; i < 10; i++) {
            sum2 = 0;
            for (int j = 0; j < 20; j++) {
                if ((array1[i][j] == 5)) {
                    ++sum2;
                }
            }
            if (sum2 >= 3){
                array2[k] = i+1;
                k++;
            }
        }
        out.println("Номера строк ="+ Arrays.toString(array2));
    }
}
