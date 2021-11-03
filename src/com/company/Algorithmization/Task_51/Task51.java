package com.company.Algorithmization.Task_51;
import java.util.*;
import static java.lang.System.*;

public class Task51 {
    public static void main(String[] args) {
        out.println("Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию");
        Scanner sc = new Scanner(in);
        out.println("Введите число ");
        int n = sc.nextInt();
        out.println("Необходимо произвести "+resultNumb(n)+" вычитаний");
    }
    public static int resultNumb (int n){
        int count = 0;
        do{
            n = n - sumNumbers(n);
            count++;
        }while (n > 0);
        return count;
    }
    public static int sumNumbers (int n){
        int sum = 0;
        for (; n > 0; n/=10) sum+=n%10;
        return sum;
    }
}
