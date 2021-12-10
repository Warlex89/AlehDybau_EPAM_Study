package com.company.Basics_of_OOP.Task_3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

public class Commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int year = 2021;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("08.03."+year,dtf), "Международный женский день");
        calendar.addHoliday(LocalDate.parse("07.01."+year,dtf), "Православное Рождество");
        calendar.addHoliday(LocalDate.parse("23.02."+year,dtf), "День Защитника Отечества");

        int choice = 10;
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы добавить праздничный день");
        out.println("Введите 2 - чтобы вывести на консоль все праздники");
        out.println("Введите 3 - чтобы удалить праздник");
        out.println("Введите 4 - чтобы вывести на консоль все выходные");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    out.println("Введите название праздниа ");
                    String holiday = sc.nextLine();
                    out.println("Введите день и месяц праздника. Пример: 01.01.");
                    String dayMonth = sc.nextLine();
                    calendar.addHoliday(LocalDate.parse(dayMonth+year,dtf), holiday);
                }
                case 2 -> {
                    out.println("Праздничные дни "+year+" года: ");
                    calendar.printAllHolidays();
                }
                case 3 -> {
                    out.println("Введите название праздника, который нужно удалить ");
                    String name = sc.nextLine();
                    calendar.removeHoliday(name);
                }
                case 4 -> {
                    out.println("Выходные дни "+year+" года: ");
                    calendar.printAllWeekends();
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}

