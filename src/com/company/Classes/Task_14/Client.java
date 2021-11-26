package com.company.Classes.Task_14;
import java.util.ArrayList;

public class Client {
    private final String name;
    private final String lastName;
    public ArrayList<Account> accounts;

    public Client(String name, String lastName, ArrayList<Account> accounts) {
        this.name = name;
        this.lastName = lastName;
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Добавлен новый счёт");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Имя клиента: %s, Фамилия клиента: %s",name,lastName);
    }
}
