package com.company.Algorithmization.Task_8;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args){
        Random random = new Random();
        int n, l;
        int[] array1;
        int[] array2;
        int min;
        int countmin=0;
        int index = 0;
        boolean st;
        out.println("Дана последовательность целых чисел. Образовать новую последовательность, выбросив из\n" +
                "исходной те члены, которые равны min().");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            st = random.nextBoolean();
            if (!st) n = (-n);
            l = (int) (random() * n);// создаётся случайное действительное число от -n< до <n для массива
            array1[i] = l;
        }
        out.println("Первый массив "+ Arrays.toString(array1));
        min = array1[0];// принимаем значение первого элемента в качестве минимального
        for (int j : array1) min = Math.min(min, j);// находим минимальное число в массиве
        for (int j : array1) if (min == j) countmin++;// считаем количество повторений минимального значения
        array2 = new int[array1.length-countmin]; // инициируем итоговый массив
        for (int j : array1) {
            if (j != min) { // заполняем новый массив элементами без минимального значения предыдущего массива
                array2[index] = j;
                index++;// индекс второго массива
            }
        }
        out.println("Получен новый массив "+ Arrays.toString(array2));
    }
}
