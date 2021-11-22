package com.company.Classes.Task_10;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Commands {
    public static void main(String[] args) throws ParseException {
        DateBaseOfAirlines airlines = new DateBaseOfAirlines(new ArrayList<>());
        airlines.addAirlinesToDatabase("Minsk", 1456, "Tupolev Tu-134",
                "14:20:30","Monday");
        airlines.addAirlinesToDatabase("Gomel", 26574, "Ilyushin IL-62",
                "20:30:50","Tuesday");
        airlines.addAirlinesToDatabase("Minsk", 27235, "Sukhoi Superjet-100",
                "08:30:10","Wednesday");
        airlines.addAirlinesToDatabase("London", 1235, "IL-96-300",
                "06:10:30","Tuesday");
        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 чтобы найти все рейсы для заданного пункта назначения");
        out.println("Введите 2 чтобы найти все рейсы для заданного дня недели");
        out.println("Введите 3 чтобы найти все рейсы для заданного дня недели, время вылета для которых больше заданного");
        out.println("Введите 4 чтобы добавить рейс");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 -> {
                    out.println("Укажите пункт назначения");
                    String dest = sc.nextLine();
                    airlines.outByDestination(dest);
                }
                case 2 -> {
                    out.println("Укажите день недели");
                    String day = sc.nextLine();
                    airlines.outByDay(day);
                }
                case 3 -> {
                    out.println("Укажите день недели");
                    String day = sc.nextLine();
                    out.println("Укажите время");
                    String time = sc.nextLine();
                    airlines.outByComplexTime(day,time);
                }
                case 4 -> {
                    out.println("Введите пункт назначения ");
                    String dest = sc.nextLine();
                    out.println("Введите номер рейса ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    out.println("Введите тип самолёта ");
                    String type = sc.nextLine();
                    out.println("Введите время вылета ");
                    String time = sc.nextLine();
                    out.println("Введите день недели ");
                    String day = sc.nextLine();
                    airlines.addAirlinesToDatabase(dest, number, type, time, day);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}

