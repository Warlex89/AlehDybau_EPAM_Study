package com.company.Algorithmization.Task_42;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.System.*;


public class Task42 {public static void main(String[] args) {
    int n, k, m;
    out.println(" Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов\n" +
            "массива с номерами от k до m");
    Scanner sc = new Scanner(in);
    out.println("Введите размер массива ");
    n = sc.nextInt();
    int[] arr = createArrays(n);
    out.println("Получен массив " + Arrays.toString(arr));
    out.println("От какого элемента нужно посчитать ");
    k = sc.nextInt();
    out.println("До(невключая) какого элемента нужно посчитать ");
    m = sc.nextInt();
    resultsTask(k, m, arr);
}
    public static int[] createArrays(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = (int) (random() * n) + 1;
        return arr;
    }
    public static void resultsTask(int k, int m, int[] arr){
        int sum = 0;
        int[] res = new int[3];
        int range = 0;
        for(int i = k-1; i < m-1; i++) {
            sum += arr[i];
            res[range] = arr[i];
            range++;
            if (range == 3){
                out.println("Сумма чисел "+Arrays.toString(res)+" равна " + sum);
                range = 0;
                sum = 0;
            }
            if (range < 3 && i > m-3 && i < m-1) out.println("Количество оставшихся чисел менее 3-х");
        }
    }
}

