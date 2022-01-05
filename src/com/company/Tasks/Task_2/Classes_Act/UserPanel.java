package com.company.Tasks.Task_2.Classes_Act;
import com.company.Tasks.Task_2.Classes_Inf.ResourcesPanel;
import com.company.Tasks.Task_2.Classes_Inf.Sleep;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.*;

public class UserPanel extends ResourcesPanel {

    public void mainPanel(){
        commands();
        sl.sleeping();
        actions();
    }

    public void commands(){
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы просмотреть все заметки");
        out.println("Введите 2 - чтобы добавить заметку");
        out.println("Введите 3 - чтобы найти заметки по теме");
        out.println("Введите 4 - чтобы найти заметки по дате");
        out.println("Введите 5 - чтобы найти заметки по электронной почте");
        out.println("Введите 6 - чтобы найти заметки по теме и дате");
        out.println("Введите 7 - чтобы найти заметки по слову в сообщении");
    }

    public void actions(){
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> nB.printAllNotes();
                case 2 -> {
                    out.println("Введите тему заметки");
                    topic = sc.nextLine();
                    out.println("Введите дату");
                    date = sc.nextLine();
                    if(check(date, 2)){
                        out.println("Введите электронную почту");
                        email = sc.nextLine();
                        if(check(email, 1)) {
                            out.println("Введите текст сообщения");
                            String text = sc.nextLine();
                            nB.addNoteToList(topic, date, email, text);
                        } else out.println("Неверный адрес электронной почты");
                    }else out.println("Неверная дата");
                }
                case 3 -> {
                    out.println("Введите тему заметки");
                    topic = sc.nextLine();
                    nB.findNoteByTopic(topic);
                }
                case 4 -> {
                    out.println("Введите дату");
                    date = sc.nextLine();
                    if(check(date, 2)) nB.findNoteByDate(date);
                    else out.println("Неверная дата");
                }
                case 5 -> {
                    out.println("Введите электронную почту");
                    email = sc.nextLine();
                    if(check(email, 1)) nB.findNoteByEmail(email);
                    else out.println("Неверный адрес электронной почты");
                }
                case 6 -> {
                    out.println("Введите тему заметки");
                    topic = sc.nextLine();
                    out.println("Введите дату");
                    date = sc.nextLine();
                    if(check(date,2)) nB.findNote(topic, date);
                    else out.println("Неверная дата");
                }
                case 7 -> {
                    out.println("Введите поисковое слово");
                    String word = sc.nextLine();
                    if(check(word, 3)) nB.findByWord(word);
                    else out.println("Некорректное введение данных");
                }
                case 0 -> {
                    nB.finish();
                    sl.sleeping();
                    out.println("Закрытие программы");
                }
                default -> out.println("Неверная команда");
            }
        }
    }

    boolean check(String word, int num){
        switch (num){
            case 1 -> regex = "\\w+@\\w+\\.\\p{Lower}{2,4}";
            case 2 -> regex = "^\\d{2}\\.\\d{2}\\.\\d{4}$";
            case 3 -> regex = "\\b[а-я]+\\b";
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }

    Sleep sl = () ->{
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    };
}
