package com.company.Tasks.Task_3.Classes_act;
import com.company.Tasks.Task_3.Classes_inf.Human;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class LecturePanel {
    Scanner sc = new Scanner(in);
    int choice = 10;
    Human lecture;
    XMLParser xmlParser = new XMLParser();

    public LecturePanel() throws ParserConfigurationException, IOException, SAXException { }

    public void mainPanel(String surname){
        setHuman(surname);
        commands();
        actions();
    }

    void commands(){
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы просмотреть свое дело");
        out.println("Введите 2 - чтобы просмотреть дела всех студентов");
        out.println("Введите 3 - чтобы изменить своё имя");
        out.println("Введите 4 - чтобы изменить свою фамилию");
        out.println("Введите 5 - чтобы изменить средний балл указанного студента");
        out.println("Введите 6 - чтобы добавить студента");
        out.println("Введите 7 - чтобы отчислить студента");
    }

    void actions(){
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> out.println(lecture);
                case 2 -> {
                    for(Human student : xmlParser.humans){
                        if(student.getStatus().toLowerCase().trim().
                        compareTo("студент") == 0) out.println(student);
                    }
                }
                case 3 -> {
                    out.println("Введите новое имя ");
                    String newName = sc.nextLine();
                    xmlParser.changeName(lecture.getName(), newName, lecture.getStatus());
                    lecture.setName(newName);
                }
                case 4 -> {
                    out.println("Введите новую фамилию ");
                    String newSurname = sc.nextLine();
                    xmlParser.changeSurname(lecture.getSurname(), newSurname, lecture.getStatus());
                    lecture.setSurname(newSurname);
                }
                case 5 -> {
                    out.println("Введите фамилию студента ");
                    String studentName = sc.nextLine();
                    out.println("Введите новый средний балл ");
                    String newAvScore = String.valueOf(sc.nextInt());
                    xmlParser.changeAvScore(studentName,newAvScore.trim());
                }
                case 6 -> {
                    out.println("Введите имя студента ");
                    String name = sc.nextLine();
                    out.println("Введите фамилию студента");
                    String surname = sc.nextLine();
                    out.println("Введите год обучения");
                    String yStudy = sc.nextInt() + " ";
                    sc.nextLine();
                    out.println("Введите факультет (Лечебное дело/Педиатрический/Психиатрический)");
                    String fac = sc.nextLine();
                    out.println("Введите средний балл ");
                    String avScore = sc.nextInt() + " ";
                    xmlParser.adStudent(name, surname, yStudy.trim(), fac, avScore.trim());
                }
                case 7 -> {
                    out.println("Фамилия студента ");
                    xmlParser.deleteStudent(sc.nextLine());
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }

    public void setHuman(String surname){
        for(Human human : xmlParser.humans){
            if(surname.toLowerCase().trim().
                    compareTo(human.getSurname().trim().toLowerCase()) == 0){
                lecture = human;
                break;
            }
        }
    }
}
