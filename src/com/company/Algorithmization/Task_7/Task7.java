package com.company.Algorithmization.Task_7;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int n, array[], l, max = 0;
        boolean st;
        out.println("Даны действительные числа. Найти");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            st = random.nextBoolean();
            if (!st) n = (-n);
            l = (int) (random() * n);// создаётся случайное действительное число от -n< до <n для массива
            array[i] = l;
        }
        for(int j = 0; j < array.length/2; j++){
            max = (array[j]+array[array.length-1-j] > max && j != array.length-1-j) ? array[j]+array[array.length-1-j] : max;
        }
        out.println("Получен массив "+ Arrays.toString(array));
        out.println("Максимальная сумма чисел = "+max);
    }
}
