package com.company.Tasks.Task_3.Classes_act;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class SwitchPanel {
    public void run(String status, String surname) throws ParserConfigurationException, IOException, SAXException {
     switch (status.trim()){
         case "Студент" -> new StudentPanel().mainPanel(surname);
         case "Преподаватель" -> new LecturePanel().mainPanel(surname);
         default -> System.out.println("Неверная команда");
     }
    }
}
