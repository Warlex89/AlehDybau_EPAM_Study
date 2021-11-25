package com.company.Classes.Task_12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Commands {
    public static void main(String[] args) {
        String name = "Mazda";
        Wheel wheel1 = new Wheel(18);
        Wheel wheel2 = new Wheel(18);
        Wheel wheel3 = new Wheel(18);
        Wheel wheel4 = new Wheel(18);
        ArrayList<Wheel> wheels = new ArrayList<>(Arrays.asList(wheel1,wheel2,wheel3,wheel4));
        Engine dtx123 = new Engine(2);
        Car mazda = new Car(name, 100, wheels,dtx123);

        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 - ехать");
        out.println("Введите 2 - проверить одинаковы ли колёса");
        out.println("Введите 3 - заправиться");
        out.println("Введите 4 - узнать марку автомболиля");
        out.println("Введите 5 - чтобы заменить колёса");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> mazda.run();
                case 2 -> mazda.wheelsEqual();
                case 3 -> {
                    out.println("На сколько заправить автомобиль? ");
                    int fuel = sc.nextInt();
                    mazda.reFuel(fuel);
                }
                case 4 -> out.println(mazda);
                case 5 -> {
                    out.println("Введите диаметр колеса №1");
                    Wheel wheel_1 = new Wheel(sc.nextInt());
                    out.println("Введите диаметр колеса №2");
                    Wheel wheel_2 = new Wheel(sc.nextInt());
                    out.println("Введите диаметр колеса №3");
                    Wheel wheel_3 = new Wheel(sc.nextInt());
                    out.println("Введите диаметр колеса №4");
                    Wheel wheel_4 = new Wheel(sc.nextInt());
                    ArrayList<Wheel> wheels1 = new ArrayList<>(Arrays.asList(wheel_1,wheel_2,wheel_3,wheel_4));
                    mazda.wheelChange(wheels1);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
