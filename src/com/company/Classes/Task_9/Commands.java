package com.company.Classes.Task_9;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.
 */

public class Commands {
    public static void main(String[] args) {
        DataBase books = new DataBase(new ArrayList<>());
        books.addBookToDataBase("Я, робот", "Азимов", "Эксмо",
                2020, 238, 16.4f,"мягкий");
        books.addBookToDataBase("Академия", "Азимов", "Эксмо",
                2021, 320, 18.8f,"твёрдый");
        books.addBookToDataBase("Скотный двор", "Оруэлл", "АСТ",
                2017, 368, 15.3f,"твёрдый");
        books.addBookToDataBase("Хоббит", "Толкин", "АСТ",
                2019, 320, 26.9f,"твёрдый");
        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 чтобы найти все книги заданного автора");
        out.println("Введите 2 чтобы найти все книги, выпущенные заданным издательством");
        out.println("Введите 3 чтобы найти все книги, выпущенные после заданного года");
        out.println("Введите 4 чтобы добавить книгу в базу данных");
        out.println("Введите 5 чтобы получить полный список книг в алфавитном порядке");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 -> {
                    out.println("Укажите имя автора");
                    String name = sc.nextLine();
                    ArrayList<Book> list = books.outBooksByAuthors(name);
                    if (list.size() == 0) out.println("Книги указанного автора не найдены");
                    else list.forEach(out::println);
                }
                case 2 -> {
                    out.println("Укажите название издательства");
                    String namePH = sc.nextLine();
                    ArrayList<Book> list = books.outBooksByPublishingHouse(namePH);
                    if (list.size() == 0) out.println("Книги указанного издательства не найдены");
                    else list.forEach(out::println);
                }
                case 3 -> {
                    out.println("Укажите год");
                    int date = sc.nextInt();
                    ArrayList<Book> list = books.outBooksByDate(date);
                    if (list.size() == 0) out.println("Книги после указанного года не найдены");
                    else list.forEach(out::println);
                }
                case 4 -> {
                    out.println("Введите название книги ");
                    String title = sc.nextLine();
                    out.println("Введите фамилию автора ");
                    String author = sc.nextLine();
                    out.println("Введите издательство ");
                    String pH = sc.nextLine();
                    out.println("Введите дату публикации ");
                    int date = sc.nextInt();
                    out.println("Введите количество страниц ");
                    int pages = sc.nextInt();
                    out.println("Введите стоимость книги ");
                    float price = sc.nextFloat();
                    sc.nextLine();
                    out.println("Тип переплета ");
                    String bT = sc.nextLine();
                    books.addBookToDataBase(title, author, pH, date, pages, price, bT);
                }
                case 5 -> {
                    ArrayList<Book> list = books.sortByTitle(books.getDataBase());
                    list.forEach(out::println);
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }

}
