package com.company.Algorithmization.Task_34;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task34 {
    public static void main(String[] args) {
    int n , sum;
    int[] array1;
    int[] array2;
    int mltEl = 1;
    out.println("Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания");
    Scanner sc = new Scanner(in);
    out.println("Введите размер массива дробей ");
    n = sc.nextInt();
    array1 = new int[n];
    array2 = new int[n];
    // создаём массивы с числителями и знаменателями
    for (int i = 0; i < n; i++){
        array1[i] = (int) (random() * n)+1;
        array2[i] = (int) (random() * n)+1;
        // увеличиваем значение знаменателя, чтобы он был больше числителя
        do array2[i]++;
        while (array2[i] <= array1[i]);
    }
    out.println("Числители " + Arrays.toString(array1));
    out.println("Знаменатели " + Arrays.toString(array2));
    // находим общий знаменатель
    for (int i = 0; i < n; i++) {
        sum = 0;
        for (int j = i + 1; j < n; j++) {
            if ((array2[i] == array2[j])) {
                ++sum;
            }
        }
        if (sum == 0) mltEl *=array2[i];

    }
    // приводим дроби к общему знаменателю
    for (int i = 0; i < n; i++){
        array1[i] = array1[i]*(mltEl/array2[i]);
        array2[i] = mltEl;
    }
    Arrays.sort(array1);
    out.println("Числители после приведения и упорядочивания " + Arrays.toString(array1));
    out.println("Знаменатели после приведения и упорядочивания " + Arrays.toString(array2));
}
}

