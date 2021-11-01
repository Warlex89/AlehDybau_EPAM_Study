package com.company.Algorithmization.Task_41;
import java.util.Arrays;
import static java.lang.System.*;


public class Task41 {public static void main(String[] args) {
    int array1[], sum = 0;
    out.println("Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9");
    array1 = new int[9];
    for (int i = 0; i < array1.length; i++) {
        array1[i] = i+1;
        if(array1[i]%2 == 1){
            int calc = calcFactorial(array1[i]);
            sum+=calc;
        }
    }
    out.println("Числа " + Arrays.toString(array1));
    out.println("Сумма факториалов нечётных чисел равна "+ sum);
}
    public static int calcFactorial(int f){
        int factorialNumber = 1;
        for (int i = f; i > 0; i--){
            factorialNumber *= i;
        }
        return factorialNumber;
    }
}

