package com.company.Algorithmization.Task_5;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] main){
        Random random = new Random();
        int n, array[], l;
        out.println("Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for(int i = 0; i<n; i++){
            l = (int) (random() * n);// создаётся случайное действительное число от 0 до n для массива
            array[i] = l;
            if(l>i) out.println(l);
            }
        out.println("Получен массив "+ Arrays.toString(array));
    }
}
