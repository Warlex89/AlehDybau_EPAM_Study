package com.company.Algorithmization.Task_3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        Random random = new Random();
        int n, array[], l, countM = 0, countP = 0, countO = 0;
        boolean st = true;
        out.println("Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for(int i=0; i<array.length; i++){
            st = random.nextBoolean();
            if(st == false) n=(-n);
            l = (int)(random()*n);// создаётся случайное действительное число от -n до n для массива
            if(l>0) countP+=1;
            if(l<0) countM+=1;
            if(l==0) countO +=1;
            array[i] = l;
        }
        out.println("Получен массив "+ Arrays.toString(array));
        out.println("Количество положительных элементов = "+countP);
        out.println("Количество отрицательных элементов = "+countM);
        out.println("Количество нулевых элементов = "+countO);
    }
}
