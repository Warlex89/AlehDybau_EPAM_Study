package com.company.Algorithmization.Task_30;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task30 {
    public static void main(String[] args) {
        int a1, k;
        int[] array1;
        int count = 0;
        boolean needIteration = true;
        out.println("Сортировка обменами");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива ");
        a1 = sc.nextInt();
        array1 = new int[a1];
        for (int i = 0; i < a1; i++) array1[i] = (int) (random() * a1);
        Arrays.sort(array1);
        out.println("Первый массив (в порядке возрастания) " + Arrays.toString(array1));
        while(needIteration){
            needIteration = false;
            for (int i = 0; i < a1; i++){
                if (i!=a1-1 && array1[i] < array1[i+1]){
                    k = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = k;
                    needIteration = true;
                    count++;
                }
            }
        }
        out.println("Итоговый массив (в порядке убывания) " + Arrays.toString(array1));
        out.println("Количество перестановок = " + count);
    }
}
