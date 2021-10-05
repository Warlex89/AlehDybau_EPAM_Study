/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры*/
package com.company.Basics.Task_18;
import java.util.Scanner;
import static java.lang.System.*;

public class Task18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите значение m");
        int m = sc.nextInt();
        out.println("Введите значение n");
        int n = sc.nextInt();
        while(m<n){
            for(int i=2; i<=n-m+1; i++){   // n-m+1 - количество циклов; прибавляем 1, т.к. i = 2, а не 1
                if(m%i==0 & m!=i){
                    out.println("Делитель = "+i);
                }
            }
            m+=1;
            out.println("Новое значение m ="+m);
        }
    }
}
