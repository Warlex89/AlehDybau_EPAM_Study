package com.company.Algorithmization.Task_10;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int n, array[], l;
        out.println("Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй\n" +
                "элемент (освободившиеся элементы заполнить нулями)");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            l = (int) (random() * n);// создаётся случайное действительное число от 0 до <n для массива
            array[i] = l;
        }
        out.println("Первоначальный массив: "+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) array[i] = (i % 2 == 1) ? 0 : array[i];// выбрасываем каждый второй элемент
        out.println("Итоговый массив: "+ Arrays.toString(array));
    }
}
