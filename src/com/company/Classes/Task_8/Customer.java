package com.company.Classes.Task_8;
import java.math.BigInteger;

public class Customer {
    public static int firstID = 1;
    public int iD = 0;
    public String name;
    public String lastName;
    public String patronymic;
    public String address;
    public BigInteger cardNumber;
    public long bankAccountNumber;

    public Customer(String lastName, String name, String patronymic, String address, BigInteger cardNumber, long bankAccountNumber) {
        this.iD = firstID++;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "iD = " + iD +
                ", LastName = '" + lastName + '\'' +
                ", Name = '" + name + '\'' +
                ", Patronymic = '" + patronymic + '\'' +
                ", Address = '" + address + '\'' +
                ", CardNumber = " + cardNumber +
                ", BankAccountNumber = " + bankAccountNumber +
                '}';
    }

    public int getID() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
