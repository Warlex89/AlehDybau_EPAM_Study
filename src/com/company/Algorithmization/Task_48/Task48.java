package com.company.Algorithmization.Task_48;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Найти все числа Армстронга от 1 до k(включительно).");
        out.println("Введите число k ");
        int k = sc.nextInt();
        createArmArrays(k);
    }
    public static void createArmArrays(int k){
        List<Integer> armstrongNumb = new ArrayList<>();
        for (int i = 1; i <= k; i++){
            int z = sumNumbers(i);
            if(i == z) armstrongNumb.add(i);
        }
        out.println(armstrongNumb);
    }
    public static int sumNumbers (int n){
        int sum = 0;
        for (; n > 0; n/=10){
            int x = (int) pow(n%10,3);
            sum+=x;
        }
        return sum;
    }
}
