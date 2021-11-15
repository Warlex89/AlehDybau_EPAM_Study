package com.company.Classes.Task_3;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private String name;
    private int group;
    private int[] grade;

    public Student(String name, int group, int[] grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Student [] student = new Student[10];
        for (int i = 0; i < student.length; i++){
            out.println("Карточка студента № "+(i+1));
            out.println("Введите Ф.И.О. студента ");
            String name = sc.nextLine();
            out.println("Введите № группы студента ");
            int group = sc.nextInt();
            sc.nextLine();
            int [] grade = new int[5];
            out.println("Введите 5 оценок студента");
            for (int j = 0; j < 5; j++){
                grade[j] = sc.nextInt();
                sc.nextLine();
            }
            student[i] = new Student(name,group,grade);
        }
        printBestStudent(student);
    }

    public static void printBestStudent(Student[] students){
        System.out.println("Лучшие студенты: ");
        for(Student student : students){
            int minGrade = 10;
            for (int grade : student.grade){
                minGrade = Math.min(grade, minGrade);
            }
            if (minGrade >= 9) out.println(student.name+" "+student.group);
        }
    }
}

