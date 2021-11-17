package com.company.Classes.Task_4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.*;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен поль-
 * зователем. Добавьте возможность сортировки массив по пункту назначения, при-
 * чем поезда с одинаковыми пунктами назначения должны быть упорядочены по вре-
 * мени отправления.
 */

public class Train {    public String destination;
    public int nOfTrain;
    public Date arrivalTime;
    public static SimpleDateFormat sdt = new SimpleDateFormat("HH:mm");

    public Train(String destination, int nOfTrain, Date arrivalTime) {
        this.destination = destination;
        this.nOfTrain = nOfTrain;
        this.arrivalTime = arrivalTime;
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(in);
        Train [] trains = new Train[5];
        for (int i = 0; i < trains.length; i++){
            out.println("Впишите данные пяти поездов");
            out.println("Данные поезда "+(i+1));
            out.println("Название пункта назначения ");
            String destination = sc.nextLine();
            out.println("№ поезда ");
            int nOfTrain = sc.nextInt();
            sc.nextLine();
            out.println("Время отправления ");
            String time = sc.nextLine();
            trains[i] = new Train(destination, nOfTrain, sdt.parse(time));
        }
        commands(trains);
    }

    public static void commands(Train[] trains){
        Scanner sc = new Scanner(in);
        int choice = 5;
        out.println("Введите 1 для сортировки поездов по номеру");
        out.println("Введите 2 для вывода информации о поезде по его номеру");
        out.println("Введите 3 для сортировки поездов по пункту назначения");
        out.println("Введите 4 для вывода информации о всех поездах");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0){
            out.println("Введите команду");
            choice = sc.nextInt();
            switch (choice){
                case 1: sortTrainNumber(trains);
                    break;
                case 2:
                    out.println("Введите номер поезда");
                    int x = sc.nextInt();
                    printArray(trains, x);
                    break;
                case 3: sortTrain(trains);
                    break;
                case 4: printArray(trains);
                    break;
                case 0:
                    out.println("Закрытие программы");
                default:
                    out.println("Неверная команда");
            }

        }
    }

    public static void printArray(Train [] trains){
        for (Train train : trains){
            out.println("Поезд до "+train.destination+" №"+train.nOfTrain+" время отправления: "+sdt.format(train.arrivalTime));
        }
    }

    public static void printArray(Train [] trains, int x){
        for (Train train : trains){
            if (train.nOfTrain == x)
                out.println("Поезд до "+train.destination+" №"+train.nOfTrain+" время отправления: "+sdt.format(train.arrivalTime));
        }
    }

    public static void sortTrainNumber(Train[] sortTrains){
        boolean sort = true;
        while(sort){
            sort = false;
            for (int i = 1; i < sortTrains.length; i++ ){
                if (sortTrains[i-1].nOfTrain > sortTrains[i].nOfTrain){
                    Train temp = sortTrains[i];
                    sortTrains[i] = sortTrains[i-1];
                    sortTrains[i-1] = temp;
                    sort = true;
                }
            }
        }
    }

    public static void sortTrain(Train[] sortTrains){
        for (int i = 0; i < sortTrains.length; i++){
            for (int j = sortTrains.length - 1; j > 1; j--){
                int compare = sortTrains[i].destination.compareTo(sortTrains[j].destination);
                if (compare > 0){
                    Train temp = sortTrains[i];
                    sortTrains[i] = sortTrains[j];
                    sortTrains[j] = temp;
                }else if (compare == 0){
                    if (sortTrains[i].arrivalTime.compareTo(sortTrains[j].arrivalTime) > 0){
                        Train temp = sortTrains[i];
                        sortTrains[i] = sortTrains[j];
                        sortTrains[j] = temp;
                    }
                }
            }
        }
    }
}
