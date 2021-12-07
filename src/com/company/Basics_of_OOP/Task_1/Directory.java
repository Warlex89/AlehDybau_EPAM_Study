package com.company.Basics_of_OOP.Task_1;
import java.util.ArrayList;

public class Directory {
    private String name;
    ArrayList<TextFile> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(TextFile file){
        files.add(file);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void outAllFiles(){
        files.forEach(System.out::println);
    }

    public void outFileByName(String name){
        for (TextFile file : files){
            if(file.getName().compareTo(name) == 0) file.printText();
        }
    }

    public void changeNameOfFile(String startName, String nextName){
        for (TextFile file : files){
            if(file.getName().compareTo(startName) == 0){
                file.setName(nextName);
                System.out.println("Имя файла успешно изменено");
            }
        }
    }

    public void addTextToFile(String fileName, String text){
        for (TextFile file : files){
            if (file.getName().compareTo(fileName) == 0){
                file.addText(text);
                System.out.println("Текст успешно добавлен в файл");
            }
        }
    }

    public void deleteFile(String name){
        files.removeIf(file -> file.getName().compareTo(name) == 0);
        System.out.println("Файл успешно удалён");
    }
}
