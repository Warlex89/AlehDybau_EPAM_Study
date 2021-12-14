package com.company.Basics_of_OOP.Task_4.Class_Action;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class SwitchCommands {
    int cash;
    public void Switch(){
        TreasureActions treasureActions = new TreasureActions();
        Purchase purchase = new Purchase();
        Scanner sc = new Scanner(in);
        int choice = 20;
        out.println("Введите 0 - чтобы выйти из программы");
        out.println("______ РАБОТА СО СПИСКОМ СОКРОВИЩ______");
        out.println("Введите 1 - показать список сокровищ в пещере дракона");
        out.println("Введите 2 - показать количество сокровищ");
        out.println("Введите 3 - показать самое дорогое сокровище");
        out.println("Введите 4 - отсортировать все сокровища по типу");
        out.println("Введите 5 - отсортировать все сокровища по имени");
        out.println("Введите 6 - отсортировать все сокровища по стоимости");
        out.println("______ ПОКУПКА СОКРОВИЩ У ДРАКОНА______");
        out.println("Введите 7 - указать количество денег");
        out.println("Введите 8 - добавить сокровище в корзину");
        out.println("Введите 9 - убрать сокровище из моей корзины");
        out.println("Введите 10 - получить стоимость всей корзины");
        out.println("Введите 11 - совершить покупку");
        out.println("Введите 12 - посмотреть мою корзину");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> treasureActions.printTreasureList();
                case 2 -> treasureActions.printNumberAllTreasure();
                case 3 -> treasureActions.theMostExpensiveTreasure();
                case 4 -> treasureActions.sortTreasuresByType();
                case 5 -> treasureActions.sortTreasuresByName();
                case 6 -> treasureActions.sortTreasuresByPrice();
                case 7 -> {
                    out.println("Введите баланс на ваше карте ");
                    cash = sc.nextInt();
                }
                case 8 -> {
                    out.println("Введите название продукта ");
                    String name = sc.nextLine();
                    purchase.treasureBasket.addTreasureToMyBasket(name);
                }
                case 9 -> {
                    out.println("Введите название продукта ");
                    String name = sc.nextLine();
                   purchase.treasureBasket.removeTreasureFromMyBasket(name);
                }
                case 10 -> out.println("Общая сумма корзины = " +
                        purchase.treasureBasket.getTotalPriceBasket());
                case 11 -> cash = purchase.myPayment(cash);
                case 12 -> purchase.treasureBasket.myTreasureInBasket();
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
