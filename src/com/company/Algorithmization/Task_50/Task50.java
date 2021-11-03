package com.company.Algorithmization.Task_50;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task50 {
    public static void main(String[] args){
        out.println("Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.\n" +
                "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.");
        Scanner sc = new Scanner(in);
        out.println("Введите разрядность числа ");
        int n = sc.nextInt();
        int result = sumOfNumbers(n);
        out.println("Необходимая сумма равна "+result);
        out.println("Количество чётных цифр в сумме равно "+countN(result));
    }

    public static int sumOfNumbers (int n){
        int firstNumber = (int) pow(10, n - 1);
        int lastNumber = (int) pow(10,n);
        int sum = 0;
        for (int i = firstNumber; i < lastNumber; i++){
            List<Integer> arrN = numbers(i);
            boolean exNumber = true;
            for (int j = 0; j < arrN.size(); j++){
                if (arrN.get(j)%2 == 0){
                    exNumber = false;
                    break;
                }
            }
            if (exNumber) sum+=i;
        }
        return sum;
    }

    public static List<Integer> numbers (int n){
        List<Integer> arNumb = new ArrayList<>();
        for (; n > 0; n/=10) arNumb.add(n%10);
        return arNumb;
    }

    public static int countN (int n){
        int count = 0;
        for (; n > 0; n/=10){
            if (n % 2 == 0) count++;
        }
        return count;
    }
}
