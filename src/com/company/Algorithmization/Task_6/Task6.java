package com.company.Algorithmization.Task_6;
import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args){
        Random random = new Random();
        int n, array[], l, sum = 0;
        boolean st, probablePrime;
        out.println("Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых\n" +
                "являются простыми числами");
        Scanner sc = new Scanner(in);
        out.println("Введите размер массива N ");
        n = sc.nextInt();
        array = new int[n];
        for(int i=0; i<array.length; i++) {
            st = random.nextBoolean();
            if (!st) n = (-n);
            l = (int) (random() * n);// создаётся случайное действительное число от -n< до <n для массива
            array[i] = l;
            BigInteger bigInteger = BigInteger.valueOf(i); // Тест Рабина - Миллера на простое число
            probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            //out.println("индекс "+i+"; простое? "+probablePrime+"; Число = "+l); // проверка соответствия данных
            if(probablePrime & i!=0 & i!=1) sum+=l; // тест называет 0 и 1 простыми числами, поэтому их исключаем из суммирования
        }
        out.println("Получен массив после замены "+ Arrays.toString(array));
        out.println("Сумма чисел = "+sum);
    }
}
