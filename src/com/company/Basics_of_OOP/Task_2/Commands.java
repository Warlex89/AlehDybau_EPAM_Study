package com.company.Basics_of_OOP.Task_2;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */

public class Commands {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Scanner sc = new Scanner(in);
        out.println("Введите баланс на Вашей карты ");
        double balance = sc.nextDouble();

        int choice = 10;
        out.println("Введите 1 - чтобы посмотреть все товары магазина");
        out.println("Введите 2 - чтобы посмотреть все продукты в покупательской корзине");
        out.println("Введите 3 - чтобы добавить продукт в корзину");
        out.println("Введите 4 - чтобы убрать продукт из моей корзины");
        out.println("Введите 5 - чтобы получить стоимость всей корзины");
        out.println("Введите 6 - совершить покупку");
        while (choice !=0) {
            out.println("Введите команду ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> payment.foodBasket.allShopProduct();
                case 2 -> payment.foodBasket.myProductInBasket();
                case 3 -> {
                    out.println("Введите название продукта ");
                    String name = sc.nextLine();
                    payment.foodBasket.addProductToMyBasket(name);
                }
                case 4 -> {
                    out.println("Введите название продукта ");
                    String name = sc.nextLine();
                    payment.foodBasket.removeProductFromMyBasket(name);
                }
                case 5 -> out.printf("Общая сумма корзины =  %.2f%n",payment.foodBasket.getTotalPriceBasket());

                case 6 -> balance = payment.myPayment(balance);
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }

}
