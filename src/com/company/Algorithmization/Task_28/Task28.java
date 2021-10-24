package com.company.Algorithmization.Task_28;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task28 {
    public static void main(String[] args) {
        int a1, a2, array1[], array2[], sum[];
        out.println("Даны две последовательности образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.");
        Scanner sc = new Scanner(in);
        out.println("Введите размер первой массива ");
        a1 = sc.nextInt();
        array1 = new int[a1];
        out.println("Введите размер второго массива ");
        a2 = sc.nextInt();
        array2 = new int[a2];
        sum = new int[array1.length + array2.length];
        // Создание первого массива
        for (int i = 0; i < array1.length; i++) array1[i] = (int) (random() * a1);
        Arrays.sort(array1);
        // Создание второго массива
        for (int i = 0; i < array2.length; i++) array2[i] = (int) (random() * a2);
        Arrays.sort(array2);
        // Создание итогового массива
        arraycopy(array1, 0, sum, 0, a1);
        arraycopy(array2, 0, sum, a1, a2);
        Arrays.sort(sum);
        out.println("Первый массив " + Arrays.toString(array1));
        out.println("Второй массив " + Arrays.toString(array2));
        out.println("Итоговый массив"+ Arrays.toString(sum));
    }
}
