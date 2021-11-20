package com.company.Classes.Task_8;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.
 */

public class Commands {
    public static void main(String[] args) {
        DataBase clients = new DataBase(new ArrayList<>());
        clients.addCustomerToBase("Dybau", "Aleh", "Sergeevich",
                "Minsk", new BigInteger("1111111111111111"), 12345678);
        clients.addCustomerToBase("Dybawa", "Anna", "Vladislavovna",
                "Lida", new BigInteger("2222222222222222"), 23456789);
        clients.addCustomerToBase("Gres", "Igor", "Vasilievich",
                "Comel", new BigInteger("3333333333333333"), 34567891);
        clients.addCustomerToBase("Alehno", "Svetlana", "Konstantinovna",
                "Grodno", new BigInteger("4444444444444444"), 45678912);
        clients.addCustomerToBase("Shmatko", "Dmitry", "Antonovich",
                "Brest", new BigInteger("5555555555555555"), 56789123);

        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 сортировать покупателей в алфавитном порядке");
        out.println("Введите 2 вывести покупателей по номеру карты в заданном интервале");
        out.println("Введите 3 добавить покупателя");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 -> {
                    out.println("Список покупателей в алфавитном порядке");
                    clients.sortDataBase();
                    for(int i = 0; i < clients.getDataBase().size(); i++){
                        out.println(clients.getDataBase().get(i));
                    }
                }
                case 2 -> {
                    out.println("Введите минимальный номер ");
                    String min = sc.nextLine();
                    out.println("Введите максимальный номер ");
                    String max = sc.nextLine();
                    out.println("список покупателей, у которых номер кредитной карточки находится в заданном интервале: ");
                    ArrayList<Customer> list = clients.sortByCreditRange(min,max);
                    list.sort(Comparator.comparing(Customer::getCardNumber));
                    if(list.size() == 0) out.println("Банковские карты не найдены");
                    else{
                        for (Customer customer : list) out.println(customer);
                    }
                }
                case 3 -> {
                    out.println("Введите фамилию клиента: ");
                    String lastName = sc.nextLine();
                    //sc.nextLine();
                    out.println("Введите имя клиента: ");
                    String name = sc.nextLine();
                    out.println("Введите отчество клиента: ");
                    String patr = sc.nextLine();
                    out.println("Введите адресс клиента: ");
                    String address = sc.nextLine();
                    out.println("Введите номер карточки клиента: ");
                    BigInteger cardNumber = new BigInteger(sc.next());
                    out.println("Введите банковский номер клиента: ");
                    long bankAccountNumber = sc.nextLong();
                    clients.addCustomerToBase(lastName, name, patr, address, cardNumber, bankAccountNumber);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
