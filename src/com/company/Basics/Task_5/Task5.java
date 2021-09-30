/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме ННч ММмин SSc.*/
package com.company.Basics.Task_5;
import java.util.Scanner;
import static java.lang.System.*;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        out.println("Введите количество секунд ");
        int t = sc.nextInt();
        int hour = t/3600;
        int min = (t%3600)/60;
        int sec = (t%3600)%60;
        out.println("Время = "+hour+"ч "+min+"мин "+sec+"с");
    }
}
