package com.company.Algorithmization.Task_29;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task29 {
    public static void main(String[] args) {
        int a1;
        int[] array1;
        out.println("Сортировка выбором");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива ");
        a1 = sc.nextInt();
        array1 = new int[a1];
        for (int i = 0; i < a1; i++) array1[i] = (int) (random() * a1);
        Arrays.sort(array1);
        out.println("Первый массив " + Arrays.toString(array1));
        for (int i = 0; i < a1; i++){
            int pos = i;
            int max = array1[i];
            for (int j = i+1; j < a1; j++){
                if (array1[j] > max){
                    pos = j;
                    max = array1[j];
                }
            }
            array1[pos] = array1[i];
            array1[i] = max;
        }
        out.println("Итоговый массив " + Arrays.toString(array1));
    }
}
