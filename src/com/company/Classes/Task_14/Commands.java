package com.company.Classes.Task_14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

/*
 *  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 *  имеющим положительный и отрицательный балансы отдельно.
 */

public class Commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Account account1 = new Account(123, true);
        Account account2 = new Account(0, false);
        Account account3 = new Account(-10, true);
        Account account4 = new Account(1238, true);
        ArrayList<Account> accounts = new ArrayList<>(Arrays.asList(account1,account2,account3,account4));
        Client olegD = new Client("Oleg","Dybau", accounts);
        ArrayList<Client> clients = new ArrayList<>(List.of(olegD));

        Account account5 = new Account(123, true);
        Account account6 = new Account(0, false);
        ArrayList<Account> accounts1 = new ArrayList<>(Arrays.asList(account5,account6));
        Client annaD = new Client("Anna","Dybawa", accounts1);

        Bank belarusBank = new Bank("BelarusBank", clients);
        belarusBank.addClient(annaD);

        int choice = 10;
        out.println("Введите 1 - вывести всех клиентов");
        out.println("Введите 2 - вывести все счета, указанного клиента");
        out.println("Введите 3 - заблокировать/разблокировать счёт");
        out.println("Введите 4 - посчитать общий баланс");
        out.println("Введите 5 - сумма счетов с положительным балансом");
        out.println("Введите 6 - сумма счетов с отрицательным балансом");
        out.println("Введите 7 - изменить баланс");
        out.println("Введите 8 - сортировать счета, указанного клиента по балансу");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 ->  belarusBank.getClientsBank();
                case 2 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    belarusBank.getClientsAccounts(clientName);
                }
                case 3 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    out.println("Введите ID аккаунта ");
                    int iD = sc.nextInt();
                    out.println("Введите активность аккаунта");
                    boolean x = sc.nextBoolean();
                    belarusBank.changeAccountStatus(clientName,iD,x);
                }
                case 4 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    belarusBank.getTotalBalance(clientName);
                }
                case 5 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    belarusBank.getPositiveBalance(clientName);
                }
                case 6 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    belarusBank.getNegativeBalance(clientName);
                }
                case 7 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    out.println("Введите ID аккаунта ");
                    int iD = sc.nextInt();
                    out.println("Введите новый баланс");
                    int newBal = sc.nextInt();
                    belarusBank.changeAccountBalance(clientName, iD, newBal);
                }
                case 8 -> {
                    out.println("Введите имя клиента ");
                    String clientName = sc.nextLine();
                    belarusBank.sortAccountsByBalance(clientName);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
