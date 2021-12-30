package com.company.Tasks.Task_1.Classes_Action;
import com.company.Tasks.Task_1.Classes_Information.MainPanel;
import com.company.Tasks.Task_1.Classes_Information.Panels;
import com.company.Tasks.Task_1.Classes_Information.ResourcesActions;
import static java.lang.System.out;

public class AdminPanel extends ResourcesActions implements Panels {

    MainPanel mP = () ->{
        sleeping();
        out.println("Здравствуйте администратор");
        sleeping();
        commands();
        sleeping();
        actions();
    };

    public void commands(){
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("Введите 1 - чтобы просмотреть все книги");
        out.println("Введите 2 - чтобы сортировать книги по названию");
        out.println("Введите 3 - чтобы сортировать книги по авторам");
        out.println("Введите 4 - чтобы сортировать книги по жанрам");
        out.println("Введите 5 - чтобы сортировать книги по годам");
        out.println("Введите 6 - чтобы выполнить поиск по названию");
        out.println("Введите 7 - чтобы выполнить поиск по автору");
        out.println("Введите 8 - чтобы выполнить поиск по жанру");
        out.println("Введите 9 - чтобы посмотреть список предложений");
        out.println("Введите 10 - чтобы показать всех пользователей");
        out.println("Введите 11 - чтобы добавить книгу в библиотеку");
        out.println("Введите 13 - чтобы удалить книгу из листа предложений");
    }

    public void actions(){
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> wwc.printAllBook();
                case 2 -> wwc.sortBookByTitle();
                case 3 -> wwc.sortBookByAuthor();
                case 4 -> wwc.sortBookByTypes();
                case 5 -> wwc.sortBookByYear();
                case 6 -> {
                    out.println("Введите название книги ");
                    wwc.findBookByTitle(sc.nextLine());
                }
                case 7 -> {
                    out.println("Введите автора ");
                    wwc.findBookByAuthor(sc.nextLine());
                }
                case 8 -> {
                    out.println("Введите жанр ");
                    wwc.findBookByType(sc.nextLine());
                }
                case 9 -> wwc.readOfferBook();
                case 10 -> wwa.printAllAccounts();
                case 11 -> {
                    inData();
                    wwc.addBookToCatalog(author, title, year, type);
                }
                case 13 -> {
                    inData();
                    wwc.deleteBook(author, title, year, type,wwc.offers,wwc.suggestAddress,
                            "Книга удалена из списка предложений");
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
