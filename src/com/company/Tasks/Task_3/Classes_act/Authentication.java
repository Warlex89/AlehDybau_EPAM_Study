package com.company.Tasks.Task_3.Classes_act;
import com.company.Tasks.Task_3.Classes_inf.Human;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Authentication {

    XMLParser xmlParser;
    String getUserStatus;
    String surname;

    public Authentication() throws ParserConfigurationException, IOException, SAXException {
        this.xmlParser = new XMLParser();
    }

    public void authenticationUsers() throws ParserConfigurationException, IOException, SAXException {
        Scanner sc = new Scanner(in);
        out.println("Введите логин ");
        String login = sc.nextLine();
        if(checkLogin(login)){
            new SwitchPanel().run(getUserStatus, surname);
        }else out.println("Пользователя с таким логином не существует");
    }

    public boolean checkLogin(String login){
        boolean checkLog = false;
        for (Human human : xmlParser.humans){
            if (human.getName().toLowerCase().
                    compareTo(login.toLowerCase().trim()) == 0) {
                checkLog = true;
                getUserStatus = human.getStatus();
                surname = human.getSurname();
                break;
            }
        }
        return checkLog;
    }
}
