package com.company.Classes.Task_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение x ");
        task1.setX(sc.nextInt());
        System.out.println("Введите значение y ");
        task1.setY(sc.nextInt());

        task1.onDesktopX();
        task1.onDesktopY();

        System.out.println("х + у = "+task1.getSum());
        System.out.println("Наибольшее значение "+task1.getMaxValue());
    }
}
