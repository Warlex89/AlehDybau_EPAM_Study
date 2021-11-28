package com.company.Classes.Task_15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        TourPackage tourToMilan = new TourPackage("Италия", "Милан",
                10,TypeOfTur.SHOPPING,Transport.TRAIN,Food.ALL_INCLUSIVE,525);
        TourPackage tourToLondon = new TourPackage("Англия", "Лондон",
                5,TypeOfTur.EXCURSION,Transport.PLANE,Food.NO_INCLUDE,1025);
        TourPackage tourToBarcelona = new TourPackage("Испания", "Барселона",
                7,TypeOfTur.CRUISE,Transport.SHIP,Food.ALL_INCLUSIVE,1525);
        TourPackage tourToParis = new TourPackage("Франция", "Париж",
                7,TypeOfTur.EXCURSION,Transport.CAR,Food.ONLY_BREAKFAST,750);
        TourPackage tourToDubai = new TourPackage("ОАЭ", "Дубаи",
                10,TypeOfTur.RECREATION,Transport.PLANE,Food.ALL_INCLUSIVE,1025);
        TourPackage tourToMoscow = new TourPackage("Россия", "Москва",
                6,TypeOfTur.TREATMENT,Transport.BUS,Food.NO_INCLUDE,500);
        ArrayList<TourPackage> packages = new ArrayList<>(Arrays.asList(tourToMilan,
                tourToLondon,tourToBarcelona,tourToParis,tourToDubai,tourToMoscow));

        TourAggregator ValenKiTour = new TourAggregator();
        ValenKiTour.addArrayTourAggregation(packages);

        int choice = 10;
        out.println("Введите 1 - чтобы показать все туры");
        out.println("Введите 2 - вывести все туры по указанному типу питанию");
        out.println("Введите 3 - вывести все туры по указанному типу транспорта");
        out.println("Введите 4 - вывести все туры по указанному количеству дней");
        out.println("Введите 5 - вывести все туры по типу питания, транспорта и количеству дней");
        out.println("Введите 6 - сортировать все туры по стоимости");
        out.println("Введите 7 - добавить клиента и туристическую путёвку");
        out.println("Введите 8 - показать всех клиентов фирмы");
        out.println("Введите 9 - чтобы найти клиента по фамилии");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 ->  ValenKiTour.outAllTours();
                case 2 -> {
                    out.println("Введите желаемое питание ");
                    String foodTour = sc.nextLine();
                    ValenKiTour.outTourByType(foodTour);
                }
                case 3 -> {
                    out.println("Введите транспорт ");
                    String transportTour = sc.nextLine();
                    ValenKiTour.outTourByTransport(transportTour);
                }
                case 4 -> {
                    out.println("Введите количество дней минимальное количество дней");
                    int minDays = sc.nextInt();
                    out.println("Введите количество дней максимальное количество дней");
                    int maxDays = sc.nextInt();
                    ValenKiTour.outTourByDays(minDays, maxDays);
                }
                case 5 -> {
                    out.println("Введите желаемое питание ");
                    String foodTour = sc.nextLine();
                    out.println("Введите транспорт ");
                    String transportTour = sc.nextLine();
                    out.println("Введите количество дней минимальное количество дней");
                    int minDays = sc.nextInt();
                    out.println("Введите количество дней максимальное количество дней");
                    int maxDays = sc.nextInt();
                    ValenKiTour.outByThree(foodTour, transportTour, minDays, maxDays);
                }
                case 6 -> ValenKiTour.sortToursByPrice();
                case 7 -> {
                    out.println("Ведите имя клиента ");
                    String name = sc.nextLine();
                    out.println("Введите фамилию клиента ");
                    String surname = sc.nextLine();
                    out.println("Введите город желаемого тура ");
                    String city = sc.nextLine();
                    out.println("Введите тип тура");
                    String type = sc.nextLine();
                    ValenKiTour.findTourAndCreateClientAccount(name,surname,city,type);
                }
                case 8 -> ValenKiTour.outAllClients();
                case 9 -> {
                    out.println("Введите фамилию клиента ");
                    String surname = sc.nextLine();
                    ValenKiTour.outClientBySurname(surname);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
