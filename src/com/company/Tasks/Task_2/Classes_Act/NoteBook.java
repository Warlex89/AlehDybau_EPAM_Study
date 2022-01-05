package com.company.Tasks.Task_2.Classes_Act;
import com.company.Tasks.Task_2.Classes_Inf.Note;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.out;

public class NoteBook {
    ArrayList<Note> notes;
    String noteBookAddress = "src/com/company/Tasks/Task_2/Res/notebook.txt";

    public NoteBook() {
        this.notes = new ArrayList<>();
        readText(noteBookAddress, notes);
    }

    public void readText(String address, ArrayList<Note> list){
        try{
            FileReader fileReader = new FileReader(address);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String[] noteLine = scanner.nextLine().split(" - ");
                try {
                    String topic = noteLine[0];
                    String date = noteLine[1];
                    String email = noteLine[2];
                    String mes = noteLine[3];
                    list.add(new Note(topic,date,email,mes));
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void printAllNotes(){
        sortList(2);
        notes.forEach(out::println);
    }

    public void addNoteToList(String topic, String date, String email, String mess){
        notes.add(new Note(topic, date, email, mess));
        out.println("Ваше сообщение успешно добавлено в блокнот");
    }

    public void findNoteByTopic(String fTopic){
        boolean non = true;
        sortList(1);
        for(Note note : notes){
            if(note.getTopic().toLowerCase().
                    compareTo(fTopic.trim().toLowerCase()) == 0){
                out.println(note);
                non = false;
            }
        }
        if(non) out.println("Записей на данную тему не найдено");
    }

    public void findNoteByDate(String fDate){
        boolean non = true;
        sortList(2);
        for(Note note : notes){
            if(note.getDate().toLowerCase().
                    compareTo(fDate.trim().toLowerCase()) == 0){
                out.println(note);
                non = false;
            }
        }
        if(non) out.println("Записей за данное число не найдено");
    }

    public void findNoteByEmail(String fEmail){
        boolean non = true;
        sortList(3);
            for(Note note : notes){
                if(note.getEmail().toLowerCase().
                        compareTo(fEmail.trim().toLowerCase()) == 0){
                    out.println(note);
                    non = false;
                }
            }
        if(non) out.println("Записей, поступивших на указанную почту, не найдено");
    }

    public void findNote(String topic, String date){
        boolean non = true;
        sortList(1);
        for(Note note : notes){
            if(note.getTopic().toLowerCase().
                    compareTo(topic.toLowerCase().trim()) == 0){
                if (note.getDate().compareTo(date.trim()) == 0){
                    out.println(note);
                    non = false;
                }
            }
        }
        if(non) out.println("Записей на данную тему и в указанное время не найдено");
    }

    public void findByWord(String word){
        boolean non = true;
        sortList(4);
        for(Note note : notes){
            Scanner scanner = new Scanner(note.getMess());
            String[] line = scanner.nextLine().split(" ");
            for (String s : line) {
                if (s.equalsIgnoreCase(word.trim())) {
                    out.println(note);
                    non = false;
                    break;
                }
            }
        }
        if(non) out.println("Записей с данным словом в тексте нет");
    }

    public void sortList(int dig){
        switch (dig){
            case 1 -> notes.sort(Comparator.comparing(Note::getTopic));
            case 2 -> notes.sort(Comparator.comparing(Note::getDate));
            case 3 -> notes.sort(Comparator.comparing(Note::getEmail));
            case 4 -> notes.sort(Comparator.comparing(Note::getMess));
        }
    }

    public void finish(){
        try{
            FileWriter fileWriter = new FileWriter(noteBookAddress);
            for(Note note : notes){
                fileWriter.write(note.getTopic() + " - " + note.getDate() + " - "
                        + note.getEmail() + " - " + note.getMess() + "\n");
            }
            fileWriter.flush();
        }catch (IOException e){
            out.println(e.getMessage());
        }
    }
}
