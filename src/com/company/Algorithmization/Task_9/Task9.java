package com.company.Algorithmization.Task_9;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int n, array[], l;
        out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких\n" +
                "чисел несколько, то определить наименьшее из них.");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
            array[i] = l;
        }
        int count = 0; // подсёт повторений у одного элемента
        int nmb1 = array[0]; // выводимое число, которое чаще повторяется, но меньше из других
        int maxcount = 0; // подсчитывает максимальное количество повторений
        int countSt;// значение массива, которое просчитывается
        for (int j : array) {
            countSt = j;
            count = 0;
            for (int k : array) {
                count = (countSt == k) ? (++count) : count;// подсчёт количества повторений
                nmb1 = (count > maxcount) ? countSt : nmb1;// проверка на количеств повторений
                nmb1 = (count == maxcount) ? min(nmb1, countSt) : nmb1;// проверка на наименьшее число
                maxcount = Math.max(count, maxcount);
            }
        }
        out.println("Искомая переменная = "+nmb1);
        out.println("Получен новый массив "+ Arrays.toString(array));
    }
}
