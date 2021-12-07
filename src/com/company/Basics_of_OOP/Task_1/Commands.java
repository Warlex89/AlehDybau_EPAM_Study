package com.company.Basics_of_OOP.Task_1;
import java.util.Scanner;
import static java.lang.System.*;

/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String line1 = "Язвенный колит представляет собой идиопатическое воспалительное заболевание" +
                " с первичным поражением прямой кишки и различным по протяжённости поражением ободочной.";
        TextFile text1 = new TextFile("Text1",line1);
        Directory directory = new Directory("EPAM_Test_Text");
        directory.addFile(text1);

        int choice = 10;
        out.println("Введите 1 - чтобы создать текстовый файл и добавить в директорию");
        out.println("Введите 2 - чтобы переименовать указанный текстовый файл");
        out.println("Введите 3 - чтобы вывести на консоль текстовый файл по названию");
        out.println("Введите 4 - чтобы дополнить указанный текстовый файл");
        out.println("Введите 5 - чтобы удалить указанный текстовый файл");
        out.println("Введите 6 - чтобы показать названия всех файлов директории");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    out.println("Введите название текстового файла");
                    String name = sc.nextLine();
                    out.println("Введите текст");
                    String line = sc.nextLine();
                    TextFile textFile = new TextFile(name, line);
                    directory.addFile(textFile);
                }
                case 2 -> {
                    out.println("Введите первоначальное название необходимого файла ");
                    String startName = sc.nextLine();
                    out.println("Введите новое название файла");
                    String newName = sc.nextLine();
                    directory.changeNameOfFile(startName, newName);
                }
                case 3 -> {
                    out.println("Введите название необходимого файла ");
                    String name = sc.nextLine();
                    directory.outFileByName(name);
                }
                case 4 -> {
                    out.println("Введите название необходимого файла ");
                    String name = sc.nextLine();
                    out.println("Ведите текст");
                    String text = sc.nextLine();
                    directory.addTextToFile(name, text);
                }
                case 5 -> {
                    out.println("Введите название необходимого файла ");
                    String name = sc.nextLine();
                    directory.deleteFile(name);
                }
                case 6 -> directory.outAllFiles();
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}

