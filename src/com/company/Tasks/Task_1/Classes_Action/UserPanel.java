package com.company.Tasks.Task_1.Classes_Action;
import com.company.Tasks.Task_1.Classes_Information.MainPanel;
import com.company.Tasks.Task_1.Classes_Information.Panels;
import com.company.Tasks.Task_1.Classes_Information.ResourcesActions;
import static java.lang.System.out;

public class UserPanel extends ResourcesActions implements Panels {

    MainPanel mP = () ->{
        sleeping();
        out.println("Здравствуйте пользователь");
        sleeping();
        commands();
        sleeping();
        actions();
    };

    public void commands(){
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы просмотреть все книги");
        out.println("Введите 2 - чтобы выполнить поиск по названию");
        out.println("Введите 3 - чтобы выполнить поиск по автору");
        out.println("Введите 4 - чтобы выполнить поиск по жанру");
        out.println("Введите 5 - чтобы получить почту администратора");
        out.println("Введите 6 - чтобы предложить администратору добавить книгу в библиотеку");
        out.println("Введите 7 - чтобы посмотреть список предложений");
    }

    public void actions(){
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> wwc.printAllBook();
                case 2 -> {
                    out.println("Введите название книги ");
                    wwc.findBookByTitle(sc.nextLine());
                }
                case 3 -> {
                    out.println("Введите автора ");
                    wwc.findBookByAuthor(sc.nextLine());
                }
                case 4 -> {
                    out.println("Введите жанр ");
                    wwc.findBookByType(sc.nextLine());
                }
                case 5 -> new WorkWithAccount().getAdminEmail();
                case 6 -> {
                    inData();
                    wwc.addBookToSuggestList(author, title, year, type);
                }
                case 7 -> wwc.readOfferBook();
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
