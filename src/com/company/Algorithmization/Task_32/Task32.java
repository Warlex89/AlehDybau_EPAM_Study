package com.company.Algorithmization.Task_32;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Random;


public class Task32 {
    public static void main(String[] args) {
    Random random = new Random();
    int n, l;
    int[] array;
    int h = 1;
    boolean st;
    out.println("Сортировка Шелла");
    Scanner sc = new Scanner(in);
    out.println("Введите размер массива N ");
    n = sc.nextInt();
    array = new int[n];
    // Создаём массив действительных чисел
    for (int i = 0; i < array.length; i++) {
        st = random.nextBoolean();
        if (!st) n = (-n);
        l = (int) (random() * n);
        array[i] = l;
    }
    out.println("Получен массив " + Arrays.toString(array));
    while ( h <= array.length /3) h = 3 * h + 1;
    while (h > 0){
        for (int i = h; i < array.length; i++){
            int temp = array[i];
            int j = i;
            while (j > h - 1 && array[j - h] >= temp){
                array[j] = array[j - h];
                j -= h;
            }
            array[j] = temp;
        }
        h = (h-1) / 3;
    }
    out.println("После сортировки получен следующий массив " + Arrays.toString(array));
    }
}

