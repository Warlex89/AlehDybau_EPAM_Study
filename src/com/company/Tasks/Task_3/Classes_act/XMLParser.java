package com.company.Tasks.Task_3.Classes_act;
import com.company.Tasks.Task_3.Classes_inf.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class XMLParser {
    public ArrayList<Human> humans;
    private final String LECTURE = "lecture";
    private final String STUDENT = "student";
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse("src/com/company/Tasks/Task_3/Res/archive.xml");
    AcademicTitle aT;
    Faculties fclt;

    public XMLParser() throws ParserConfigurationException, IOException, SAXException {
        XMLReader();
    }

    public void writeChanges(){
        document.getDocumentElement().normalize();
        try {
            TransformerFactory trF = TransformerFactory.newInstance();
            Transformer tr = trF.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/com/company/Tasks/Task_3/Res/archive.xml"));
            tr.transform(source, result);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteStudent(String surnameSt){
        NodeList elements = document.getElementsByTagName(STUDENT);
        for(int i = 0; i < elements.getLength(); i++){
            Node node = elements.item(i);
            String surname = node.getAttributes().getNamedItem("surname").getNodeValue();
            if(Objects.equals(surname, surnameSt)){
                node.getParentNode().removeChild(node);
                System.out.println("Студент отчислен ");
                break;
            }
        }
        writeChanges();
        XMLReader();
    }

    public void adStudent(String nameSt, String surnameSt, String yearOfStudySt, String facultySt, String avScoreSt){
        NodeList elements = document.getElementsByTagName("students");
        Element st;
        for (int i = 0; i < elements.getLength(); i++) {
            st = (Element) elements.item(i);
            Element newStudent = document.createElement("student");
            newStudent.setAttribute("name", nameSt);
            newStudent.setAttribute("surname", surnameSt);
            newStudent.setAttribute("yearOfStudy", yearOfStudySt);
            newStudent.setAttribute("faculty", facultySt);
            newStudent.setAttribute("avScore", avScoreSt);
            st.appendChild(newStudent);
            System.out.println("Студент зачислен ");
            break;
        }
        writeChanges();
        XMLReader();
    }

    public void changeAvScore(String studentName, String newAvScore){
        NodeList elements = document.getElementsByTagName(STUDENT);
        for(int i = 0; i < elements.getLength(); i++){
            Element test = (Element) elements.item(i);
            String name = test.getAttributes().getNamedItem("name").getNodeValue();
            if(Objects.equals(name, studentName)){
                test.getAttributes().getNamedItem("avScore").setNodeValue(newAvScore);
                System.out.println("Ваше имя изменено на " + newAvScore);
                break;
            }
        }
        writeChanges();
        XMLReader();
    }

    public void changeName(String startName, String endName, String status){
        switch(status){
        case "Студент" -> {NodeList elements = document.getElementsByTagName(STUDENT);
        for(int i = 0; i < elements.getLength(); i++){
            Element test = (Element) elements.item(i);
            String name = test.getAttributes().getNamedItem("name").getNodeValue();
            if(Objects.equals(name, startName)){
                test.getAttributes().getNamedItem("name").setNodeValue(endName);
                System.out.println("Ваше имя изменено на " + endName);
            }
        }
        writeChanges();
        XMLReader();
    }
        case "Преподаватель" -> {
            NodeList elements = document.getElementsByTagName(LECTURE);
            for(int i = 0; i < elements.getLength(); i++){
                Element test = (Element) elements.item(i);
                String name = test.getAttributes().getNamedItem("name").getNodeValue();
                if(Objects.equals(name, startName)){
                    test.getAttributes().getNamedItem("name").setNodeValue(endName);
                    System.out.println("Ваше имя изменено на " + endName);
                }
            }
            writeChanges();
            XMLReader();
        }
        }
    }

    public void changeSurname(String startSurname, String endSurname, String status){
        switch (status){
        case "Студент" -> {NodeList elements = document.getElementsByTagName(STUDENT);
        for(int i = 0; i < elements.getLength(); i++){
            Element test = (Element) elements.item(i);
            String name = test.getAttributes().getNamedItem("surname").getNodeValue();
            if(Objects.equals(name, startSurname)){
                test.getAttributes().getNamedItem("surname").setNodeValue(endSurname);
                System.out.println("Ваша фамилия изменена на " + endSurname);
            }
        }
        writeChanges();
        XMLReader();
    }
        case "Преподаватель" -> {
            NodeList elements = document.getElementsByTagName(LECTURE);
            for(int i = 0; i < elements.getLength(); i++){
                Element test = (Element) elements.item(i);
                String name = test.getAttributes().getNamedItem("surname").getNodeValue();
                if(Objects.equals(name, startSurname)){
                    test.getAttributes().getNamedItem("surname").setNodeValue(endSurname);
                    System.out.println("Ваша фамилия изменена на " + endSurname);
                }
            }
            writeChanges();
            XMLReader();
        }
        }
    }

    public void XMLReader() throws TransformerFactoryConfigurationError {
        humans = new ArrayList<>();
        collectInformation(document, LECTURE);
        collectInformation(document, STUDENT);
        document.getDocumentElement().normalize();
    }

    private void collectInformation(Document document, final String element){
        NodeList elements = document.getElementsByTagName(element);
        for(int i = 0; i < elements.getLength(); i++){
            NamedNodeMap attributes = elements.item(i).getAttributes();
            String name = attributes.getNamedItem("name").getNodeValue();
            switch (element){
                case LECTURE -> {
                    String surname = attributes.getNamedItem("surname").getNodeValue();
                    String academicTitle = attributes.getNamedItem("academicTitle").getNodeValue();
                    switch (academicTitle){
                        case "профессор" -> aT = AcademicTitle.PROFESSOR;
                        case "доцент" -> aT = AcademicTitle.ASSISTANT_PROFESSOR;
                        case "ассистент" -> aT = AcademicTitle.ASSISTANT;
                    }
                    humans.add(new Lecture(name, surname,aT));
                }
                case STUDENT -> {
                    String surname = attributes.getNamedItem("surname").getNodeValue();
                    int yearOfStudy = Integer.parseInt(attributes.getNamedItem("yearOfStudy").getNodeValue());
                    String faculty = attributes.getNamedItem("faculty").getNodeValue();
                    int avScore = Integer.parseInt(attributes.getNamedItem("avScore").getNodeValue());
                    switch (faculty){
                        case "Лечебное дело" -> fclt = Faculties.LECH;
                        case "Педиатрический" -> fclt = Faculties.PED;
                        case "Психиатрический" -> fclt = Faculties.PSYCHO;
                    }
                    humans.add(new Student(name,surname,yearOfStudy,fclt,avScore));
                }
            }
        }
    }
}
