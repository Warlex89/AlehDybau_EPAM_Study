package com.company.Algorithmization.Task_47;
import java.util.*;
import static java.lang.System.*;

public class Task47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Найти и напечатать все пары «близнецов» из отрезка");
        out.println("Введите натуральное число (число должно быть больше 2) ");
        int n = sc.nextInt();
        pairsNumber(n);
    }
    public static void pairsNumber(int n){
        int[] arr = new int[2];
        for (int i = n; i+2 <= 2*n; i++){
            arr[0] = i;
            arr[1] = i+2;
            out.println(Arrays.toString(arr));
        }
    }
}
