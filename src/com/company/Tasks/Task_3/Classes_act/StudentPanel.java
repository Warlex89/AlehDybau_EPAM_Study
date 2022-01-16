package com.company.Tasks.Task_3.Classes_act;
import com.company.Tasks.Task_3.Classes_inf.Human;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class StudentPanel {
    Scanner sc = new Scanner(in);
    int choice = 10;
    Human student;
    XMLParser xmlParser = new XMLParser();

    public StudentPanel() throws ParserConfigurationException, IOException, SAXException { }

    public void mainPanel(String surname){
        setHuman(surname);
        commands();
        actions();
    }

    void commands(){
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы просмотреть свое дело");
        out.println("Введите 2 - чтобы изменить своё имя");
        out.println("Введите 3 - чтобы изменить свою фамилию");
    }

    void actions(){
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> out.println(student);
                case 2 -> {
                    out.println("Введите новое имя ");
                    String newName = sc.nextLine();
                    xmlParser.changeName(student.getName(), newName, student.getStatus());
                    student.setName(newName);
                }
                case 3 -> {
                    out.println("Введите новую фамилию ");
                    String newSurname = sc.nextLine();
                    xmlParser.changeSurname(student.getSurname(), newSurname, student.getStatus());
                    student.setSurname(newSurname);
                }
                case 4 -> xmlParser.humans.forEach(out::println);
                case 0 -> out.println("Закрытие программы");

                default -> out.println("Неверная команда");
            }
        }
    }

    public void setHuman(String surname){
        for(Human human : xmlParser.humans){
            if(surname.toLowerCase().trim().
                    compareTo(human.getSurname().trim().toLowerCase()) == 0){
                student = human;
                break;
            }
        }
    }
}
