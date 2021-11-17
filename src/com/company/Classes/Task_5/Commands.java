package com.company.Classes.Task_5;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class Commands { public static void main(String[] args) {
    Counter counter = new Counter();
    Scanner sc = new Scanner(in);
    int choice = 5;
    out.println("Введите 1 для получения текущего значения счётчика");
    out.println("Введите 2 для уменьшения значения счётчика на 1");
    out.println("Введите 3 для увеличения значения счётчика на 1");
    out.println("Введите 4 чтобы установить свои значения счётчика");
    out.println("Для выхода из программы нажмите 0");
    while (choice !=0){
        out.println("Введите команду");
        choice = sc.nextInt();
        switch (choice){
            case 1: System.out.println("Значение счётчика: "+counter.getCurrentNumber());
                break;
            case 2: counter.decreaseNumber();
                break;
            case 3: counter.increaseNumber();
                break;
            case 4:
                out.println("Введите начальное значение счётчика: ");
                int startNum = sc.nextInt();
                out.println("Введите настоящее значение счётчика: ");
                int currentNum = sc.nextInt();
                out.println("Введите финальное значение счётчика");
                int finalNum = sc.nextInt();
                counter = new Counter (currentNum, startNum, finalNum);
                break;
            case 0:
                out.println("Закрытие программы");
            default:
                out.println("Неверная команда");
        }

    }

}
}

