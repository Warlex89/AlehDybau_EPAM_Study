package com.company.Classes.Task_2;
import java.util.Scanner;

/**
 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2(10,12);
        System.out.println("Значение x = "+task2.getX());
        System.out.println("Значение y = "+task2.getY());
        System.out.println("Меняем значения");

        Task2 task2_1 = new Task2();
        System.out.println("Значение x = "+task2_1.getX());
        System.out.println("Значение y = "+task2_1.getY());
        System.out.println("Меняем значения");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение х");
        task2_1.setX(sc.nextInt());
        System.out.println("Введите значение y");
        task2_1.setY(sc.nextInt());

        System.out.println("В итоге: х = "+task2_1.getX()+", а у = "+task2_1.getY());
    }
}
