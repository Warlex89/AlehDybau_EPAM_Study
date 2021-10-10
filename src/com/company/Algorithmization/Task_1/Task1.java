package com.company.Algorithmization.Task_1;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args){
        out.println("В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К");
        int n, array[],k, sum = 0;
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        out.println("Введите число K ");
        k = sc.nextInt();
        array = new int[n];
        for(int i = 0; i< array.length; i++){
            array[i] = (int)(random()*n);// массив заполняется натуральными случайными числами от 0 до n
            if(array[i]%k == 0)sum += array[i];
        }
        out.println("массив = "+Arrays.toString(array));
        out.println("Сумма элементов массива, кратных K, равна "+ sum);
    }
}
