package com.company.Basics_of_OOP.Task_5.Classes_Action;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.lang.System.in;
import static java.lang.System.out;

public class Salesman {
    CustomerBuyPresent cbp = new CustomerBuyPresent();
    Scanner sc = new Scanner(in);

    public void order(){
        out.println("Добрый день! Как я могу к Вам обращаться? ");
        String name = sc.nextLine();
        cbp.customer.setName(name);
        out.println(name+", вы хотите выбрать подарок? (да/нет)");
        String chc = sc.nextLine();
        if(cbp.choice(chc)){
            out.println("Давайте начнём со сладостей");
            sleeping();
            out.println("Вот наш ассортимент:");
            sleeping();
            cbp.printAllCandies();
            sleeping();
            out.println("Что предпочтёте?");
            cbp.chooseCandy();
            out.println("Теперь давайте выберем упаковку для вашего подарка");
            sleeping();
            cbp.chooseWrap();
            out.println("Итак выбор сделан. Теперь, давайте соберём Ваш подарок");
            sleeping();
            cbp.buildPresent();
            sleeping();
            cbp.setPresentToCustomer();
            out.println(cbp.getCustomer());
        }
        else out.println("Хорошо, если я Вам понадоблюсь позовите");

    }

    public void sleeping(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
