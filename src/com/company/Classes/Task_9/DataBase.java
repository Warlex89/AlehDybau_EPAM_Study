package com.company.Classes.Task_9;
import java.util.ArrayList;
import java.util.Comparator;

public class DataBase {
    public ArrayList<Book> dataBase;

    public DataBase(ArrayList<Book> dataBase) {
        this.dataBase = dataBase;
    }

    public void addBookToDataBase(String title, String author, String publishingHouse, int dateOfPublishing, int pageNumber, float price, String bindingType){
        this.dataBase.add(new Book(title,author,publishingHouse,dateOfPublishing,pageNumber,price,bindingType));
    }

    public ArrayList<Book> getDataBase() {
        return dataBase;
    }
    public void setDataBase(ArrayList<Book> dataBase) {
        this.dataBase = dataBase;
    }

    public ArrayList<Book> outBooksByAuthors(String authors){
        ArrayList<Book> list = new ArrayList<>();
        for(Book book : this.dataBase){
            if (book.getAuthor().compareTo(authors) == 0){
                list.add(book);
            }
        }
        return sortByTitle(list);
    }

    public  ArrayList<Book> outBooksByPublishingHouse(String publishingHouse){
        ArrayList<Book> list = new ArrayList<>();
        for(Book book : this.dataBase){
            if (book.getPublishingHouse().compareTo(publishingHouse) == 0){
                list.add(book);
            }
        }
        return sortByTitle(list);
    }

    public  ArrayList<Book> outBooksByDate(int date){
        ArrayList<Book> list = new ArrayList<>();
        for(Book book : this.dataBase){
            if (book.getDateOfPublishing() > date){
                list.add(book);
            }
        }
        return sortByTitle(list);
    }

    public ArrayList<Book> sortByTitle(ArrayList<Book> list){
        list.sort(Comparator.comparing(Book :: getTitle));
        return list;
    }

}
