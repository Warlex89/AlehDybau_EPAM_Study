package com.company.Algorithmization.Task_2;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        int n, z, l;
        int[] array;
        int count = 0;
        boolean st;
        out.println("Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим\n" +
                "числом. Подсчитать количество замен.");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        out.println("Введите значение Z ");
        z = sc.nextInt();
        for(int i = 0; i< array.length; i++){
            st = random.nextBoolean();
            if(!st) n=(-n);
            l = (int)(random()*n);// создаётся случайное действительное число от -n< до <n для массива
            if(l>z){
                array[i] = z;
                count+=1;
            }else array[i] = l;
        }
        out.println("Получен массив "+ Arrays.toString(array));
        out.println("Количество замен = "+count);
    }
}
