package com.company.Algorithmization.Task_4;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        Random random = new Random();
        int n, array[], l, min = 0, max = 0, minIndex=0, maxIndex=0;
        boolean st = true;
        out.println("Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for(int i=0; i<array.length; i++) {
            st = random.nextBoolean();
            if (st == false) n = (-n);
            l = (int) (random() * n);// создаётся случайное действительное число от -n< до <n для массива
            array[i] = l;
            if(i == 0){
                min = array[0];
                max = array[0];
            }
            else {
                if (l < min) {
                    min = l;
                    minIndex = i;

                }
                if (l > max) {
                    max = l;
                    maxIndex = i;
                }
            }
        }
        out.println("Получен массив до замены "+ Arrays.toString(array));
        out.println("min = "+min+" minIndex = "+minIndex);
        out.println("max = "+max+" maxIndex = "+maxIndex);
        array[minIndex]=max;
        array[maxIndex]=min;
        out.println("Получен массив после замены "+ Arrays.toString(array));
    }
}
