package com.company.Classes.Task_11;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Commands {
    public static void main(String[] args) {
        Word heading = new Word("Диссертация");
        String line = "Язвенный колит представляет собой идиопатическое воспалительное заболевание" +
                " с первичным поражением прямой кишки и различным по протяжённости поражением ободочной [6, 7]. ";
        Sentence sentence = new Sentence(line);
        Text dissertation = new Text(heading, sentence);
        String line1 = "Это хроническое заболевание с непрерывным или рецидивирующим течением, " +
                "которое проявляется преимущественно в третьем и четвёртом десятилетиях жизни [193]. ";
        dissertation.addSentence(new Sentence(line1));
        Scanner sc = new Scanner(in);
        int choice = 8;
        out.println("Введите 1 чтобы вывести заглавие текста");
        out.println("Введите 2 чтобы вывести текст");
        out.println("Введите 3 чтобы добавить предложение");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 -> dissertation.printHeading();
                case 2 -> dissertation.printText();
                case 3 -> {
                    out.println("Введите текст, который нужно добавить");
                    String line2 = sc.nextLine();
                    dissertation.addSentence(new Sentence(line2));
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
