package com.company.Algorithmization.Task_31;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task31 {
    public static void main(String[] args) {
        int a1;
        int[] array1;
        out.println("Сортировка вставками");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива ");
        a1 = sc.nextInt();
        array1 = new int[a1];
        for (int i = 0; i < a1; i++) array1[i] = (int) (random() * a1);
        out.println("Дан массив " + Arrays.toString(array1));
        for (int i = 1; i < a1; i++){
            int current = array1[i];
            //int index = Arrays.binarySearch(array1,0, i, current); - возможно использовать данную строку вместо целого метода
            int index = binarySearch(array1,0, i, current);
            if (index < 0) index = -(index) - 1;
            arraycopy(array1, index, array1, index+1, i-index);
            array1[index] = current;
        }
        out.println("Массив отсортирован " + Arrays.toString(array1));
    }
    public static int binarySearch(int[] arr, int first, int last, int number){
        return Arrays.binarySearch(arr,first, last, number);
    }
}
