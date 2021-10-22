package com.company.Algorithmization.Task_27;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task27 {
    public static void main(String[] args){
        int a1, a2, k, array1[], array2[], sum[];
        out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в\n" +
                "один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя\n" +
                "дополнительный массив");
        Scanner sc = new Scanner(in);
        out.println("Введите размер первой массива ");
        a1 = sc.nextInt();
        array1 = new int[a1];
        out.println("Введите размер второго массива ");
        a2 = sc.nextInt();
        array2 = new int[a2];
        sum = new int[array1.length+ array2.length];
        out.println("Введите значение К ");
        k = sc.nextInt();
        // Создание первого массива
        for (int i = 0; i < array1.length; i++) array1[i] = (int)(random()*a1);
        // Создание второго массива
        for (int i = 0; i < array2.length; i++) array2[i] = (int)(random()*a2);
        out.println("Первый массив "+ Arrays.toString(array1));
        out.println("Второй массив "+ Arrays.toString(array2));
        // Формируем третий массив
        arraycopy(array1, 0, sum, 0, k);
        arraycopy(array2, 0, sum, k, a2);
        arraycopy(array1, k, sum, k+a2, a1-k);
        out.println("Итоговый массив"+ Arrays.toString(sum));
    }

}
