package com.company.Classes.Task_6;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Commands {
    public static void main(String[] args) {
        Time time = new Time();
        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 для получения текущего времени");
        out.println("Введите 2 для установки времени (часы)");
        out.println("Введите 3 для установки времени (минуты)");
        out.println("Введите 4 для установки времени (секунды)");
        out.println("Введите 5 для изменения времени на заданное количество Часов");
        out.println("Введите 6 для изменения времени на заданное количество Минут");
        out.println("Введите 7 для изменения времени на заданное количество Секунд");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> time.getCurrentTime();
                case 2 -> {
                    out.println("Введите часы ");
                    time.setHours(sc.nextInt());
                }
                case 3 -> {
                    out.println("Введите минуты ");
                    time.setMinutes(sc.nextInt());
                }
                case 4 -> {
                    out.println("Введите секунды ");
                    time.setSeconds(sc.nextInt());
                }
                case 5 -> {
                    out.println("На сколько нужно увеличить часы? ");
                    time.changeHours(sc.nextInt());
                }
                case 6 -> {
                    out.println("На сколько нужно увеличить минуты? ");
                    time.changeMinutes(sc.nextInt());
                }
                case 7 -> {
                    out.println("На сколько нужно увеличить секунды? ");
                    time.changeSeconds(sc.nextInt());
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }

        }

    }
}
