package com.company.Tasks.Task_3;
import com.company.Tasks.Task_3.Classes_act.Authentication;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        new Authentication().authenticationUsers();
    }
}
