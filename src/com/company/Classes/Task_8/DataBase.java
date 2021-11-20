package com.company.Classes.Task_8;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class DataBase {
    public ArrayList<Customer> dataBase;

    public DataBase(ArrayList<Customer> dataBase) {
        this.dataBase = dataBase;
    }

    public ArrayList<Customer> getDataBase() {
        return dataBase;
    }

    public void setDataBase(ArrayList<Customer> dataBase) {
        this.dataBase = dataBase;
    }

    public void addCustomerToBase(String name, String lastName, String patronymic, String address, BigInteger cardNumber, long bankAccountNumber){
        this.dataBase.add(new Customer(name,lastName,patronymic,address,cardNumber,bankAccountNumber));
    }

    public void sortDataBase(){
        this.dataBase.sort(Comparator.comparing(Customer :: getLastName));
    }

    public ArrayList<Customer> sortByCreditRange(String min, String max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.dataBase){
            if (customer.getCardNumber().toString().compareTo(min) >= 0
            && customer.getCardNumber().toString().compareTo(max) <= 0){
                list.add(customer);
            }
        }
        return list;
    }

}
