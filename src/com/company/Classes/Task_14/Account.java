package com.company.Classes.Task_14;

public class Account {
    private final int iD;
    public static int startID = 1;
    private int balance;
    private String status;

    public Account(int balance, boolean status) {
        this.iD = startID++;
        this.balance = balance;
        this.status = status ? "Активный" : "Заблокирован";
    }

    @Override
    public String toString() {
        return String.format("аккаунт id: %d, баланс: %d, статус: %s",iD,balance,status);
    }

    public int getID() {
        return iD;
    }

    public int getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status ? "Активный" : "Заблокирован";
    }
}
