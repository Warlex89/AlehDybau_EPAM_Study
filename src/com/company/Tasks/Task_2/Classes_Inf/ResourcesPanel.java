package com.company.Tasks.Task_2.Classes_Inf;
import com.company.Tasks.Task_2.Classes_Act.NoteBook;
import java.util.Scanner;
import static java.lang.System.in;

public abstract class ResourcesPanel {
   public NoteBook nB = new NoteBook();
   public Scanner sc = new Scanner(in);
   public int choice = 20;
   public String regex, topic, date, email;

   public abstract void commands();
   public abstract void actions();
}
