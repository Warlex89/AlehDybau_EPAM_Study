package com.company.Tasks.Task_1.Classes_Information;
import com.company.Tasks.Task_1.Classes_Action.WorkWithAccount;
import com.company.Tasks.Task_1.Classes_Action.WorkWithCatalog;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.in;
import static java.lang.System.out;

public class ResourcesActions {
    public Scanner sc = new Scanner(in);
    public WorkWithAccount wwa = new WorkWithAccount();
    public WorkWithCatalog wwc = new WorkWithCatalog();
    public int choice = 30;
    public String author;
    public String title;
    public int year;
    public String type;

    public void inData(){
        out.println("Имя автора ");
        author = sc.nextLine();
        out.println("Название книги ");
        title = sc.nextLine();
        out.println("Год издания ");
        year = sc.nextInt();
        sc.nextLine();
        out.println("Напишите жанр книги");
        type = sc.nextLine();
    }

    public void sleeping(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
