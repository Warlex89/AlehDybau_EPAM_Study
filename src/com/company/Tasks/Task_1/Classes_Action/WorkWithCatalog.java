package com.company.Tasks.Task_1.Classes_Action;
import com.company.Tasks.Task_1.Classes_Information.Book;
import com.company.Tasks.Task_1.Classes_Information.Catalog;
import com.company.Tasks.Task_1.Classes_Information.TypeOfBook;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.out;

public class WorkWithCatalog extends Catalog {
    TypeOfBook typeBook;
    ArrayList<Book> offers;
    public String booksAddress = "src/com/company/Tasks/Task_1/Resources/books.txt";
    public String suggestAddress = "src/com/company/Tasks/Task_1/Resources/suggest.txt";

    public WorkWithCatalog() {
        books = new ArrayList<>();
        this.offers = new ArrayList<>();
        readText(booksAddress, books);
        readText(suggestAddress, offers);
    }

    public void readText(String address, ArrayList<Book> list){
        try{
            FileReader fileReader = new FileReader(address);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String[] booksLine = scanner.nextLine().split(" - ");
                try {
                    String authorName = booksLine[0];
                    String title = booksLine[1];
                    int year = Integer.parseInt(booksLine[2]);
                    String typeOfBook = booksLine[3];
                    list.add(new Book(authorName,title,year,typeOfBookDetection(typeOfBook)));
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void findBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().toLowerCase().
                    compareTo(title.trim().toLowerCase()) == 0){
               out.println(book);
            }
        }
    }

    public void findBookByAuthor(String author){
        for(Book book : books){
            if(book.getAuthor().toLowerCase().
                    compareTo(author.trim().toLowerCase()) == 0){
                out.println(book);
            }
        }
    }

    public void findBookByType(String type){
        for(Book book : books){
            if(book.getType().getName().toLowerCase().
                    compareTo(type.trim().toLowerCase()) == 0){
                out.println(book);
            }
        }
    }

    public void sortBookByAuthor(){
        books.sort(Comparator.comparing(Book::getAuthor));
        out.println("?????????? ?????????????? ?????????????????????????? ???? ??????????????");
    }

    public void sortBookByYear(){
        books.sort(Comparator.comparing(Book::getYear));
        out.println("?????????? ?????????????? ?????????????????????????? ???? ??????????");
    }

    public void sortBookByTypes(){
        books.sort(Comparator.comparing(Book::getType));
        out.println("?????????? ?????????????? ?????????????????????????? ???? ????????????");
    }

    public void sortBookByTitle(){
        books.sort(Comparator.comparing(Book::getTitle));
        out.println("?????????? ?????????????? ?????????????????????????? ???? ????????????????");
    }

    public void printAllBook(){books.forEach(out::println);}

    public void readOfferBook(){
        offers.forEach(out::println);
        if(offers.isEmpty()) out.println("?? ?????????? ?????? ??????????????????????");
    }

    public void addBook(String authorName,
                          String title,
                          int year,
                          String tB,
                        String address){
        try{
            FileWriter fileWriter = new FileWriter(address, true);
            fileWriter.write(authorName.trim()+" - "+title.trim()+" - "+year+" - "+tB.trim()+"\n");
            fileWriter.flush();
        }catch (IOException e){
            out.println(e.getMessage());
        }
    }

    public void addBookToSuggestList(String authorName,
                                     String title,
                                     int year,
                                     String tB){
        addBook(authorName,title,year,tB,suggestAddress);
        offers.add(new Book(authorName, title, year, typeOfBookDetection(tB)));
        out.println("?????????? ?????????????????? ?? ???????? ????????????");
    }

    public void addBookToCatalog(String authorName,
                                String title,
                                int year,
                                String tB){
        addBook(authorName,title,year,tB,
                booksAddress);
        books.add(new Book(authorName, title, year, typeOfBookDetection(tB)));
        out.println("?????????? ?????????????????? ?? ????????????????????");
        deleteBook(authorName,title,year,tB,offers,suggestAddress,"?????????? ?????????????? ???? ???????????? ??????????????????????");
    }

    public void deleteBook(String authorName,
                                        String title,
                                        int year,
                                        String tB,
                                        ArrayList<Book> list,
                                        String address,
                                        String message){
        for(Book book : list){
            if(book.getAuthor().toLowerCase().
            compareTo(authorName.trim().toLowerCase()) == 0){
                if(book.getTitle().toLowerCase().
                        compareTo(title.trim().toLowerCase()) == 0){
                    if(book.getYear() == year){
                        if(book.getType().getName().
                        compareTo(tB.trim().toLowerCase()) == 0){
                            list.remove(book);
                            out.println(message);
                                try{
                                    FileWriter fw = new FileWriter(address);
                                    if(list.size() != 0){
                                        for(Book book1 : list){
                                            fw.write(book1+"\n");
                                        }
                                    } else {
                                        fw.write("");
                                        break;
                                    }
                                    fw.flush();
                                }catch(IOException eg){
                                    out.println(eg.getMessage());
                                }
                        }
                    }
                }
            }
        }
    }

    public TypeOfBook typeOfBookDetection(String tB){
        switch (tB){
            case "??????????????" -> typeBook = TypeOfBook.REALISM;
            case "?????????????? ????????????????????" -> typeBook = TypeOfBook.SCIENCE;
            case "??????????????" -> typeBook = TypeOfBook.FANTASY;
            case "??????????" -> typeBook = TypeOfBook.HORROR;
            case "???????????????? ??????????" -> typeBook = TypeOfBook.LOVE;
            case "??????????????????????" -> typeBook = TypeOfBook.ADVENTURE;
            default -> typeBook = TypeOfBook.NON;
        }
        return typeBook;
    }

}
