package com.company.Algorithmization.Task_39;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Task39 {
    public static void main(String[] args) {
        int n, l;
        int[] array;
        int maxValue = 0;
        Scanner sc = new Scanner(in);
        out.println("Укажите размер массива ");
        n = sc.nextInt();
        array = new int[n];
        out.println("Получен следующий массив");
            for (int i = 0; i < n; i++) {
                l = (int) (random() * n);
                array[i] = l;
                maxValue = Math.max(array[i], maxValue);
            }
        out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = n-1; i >= 0; i--){
            if (array[i] < maxValue){
                out.println("Второе по величине число равно "+array[i]);
                break;
            }
        }
    }
}

