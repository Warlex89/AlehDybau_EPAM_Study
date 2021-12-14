package com.company.Basics_of_OOP.Task_4.Class_Action;
import com.company.Basics_of_OOP.Task_4.Class_Information.Treasure;
import java.util.ArrayList;
import static java.lang.System.out;

public class Purchase {
    TreasureActions treasureActions;
    TreasureBasket treasureBasket;

    public Purchase() {
        this.treasureActions = new TreasureActions();
        this.treasureBasket = new TreasureBasket();
    }

    public int myPayment(int balance){
        if(balance >= treasureBasket.getTotalPriceBasket()
                && treasureBasket.getTotalPriceBasket() != 0){
            balance = balance - treasureBasket.getTotalPriceBasket();
            out.println("Стоимость покупки:  " + treasureBasket.getTotalPriceBasket() +
                    "; Остаток на балансе:  " + balance);
        }
        if(treasureBasket.getTotalPriceBasket() == 0) out.println("Покупательская корзина пуста, наберите сокровищь ");
        if(balance < treasureBasket.getTotalPriceBasket()) out.println("Недостаточно средств на балансе ");
        while(treasureBasket.myTreasures.size()!=0){
            for (int i = 0; i < treasureBasket.myTreasures.size(); i++){
                treasureBasket.myTreasures.remove(treasureBasket.myTreasures.get(i));
            }
        }
        return balance;
    }

    class TreasureBasket {
        ArrayList<Treasure> myTreasures = new ArrayList<>();

        public void addTreasureToMyBasket(String nameTreasure){
            boolean non = true;
            for (Treasure treasure : treasureActions.getTreasures()){
                if(treasure.getName().compareTo(nameTreasure.trim()) == 0){
                    myTreasures.add(treasure);
                    out.println("Указанное сокровище добавлено в вашу корзину");
                    non = false;
                    break;
                }
            }
            if (non) out.println("Указанного сокровища нет в пещере");
        }

        public void removeTreasureFromMyBasket(String nameTreasure){
            for (int i = 0; i < myTreasures.size(); i++){
                if(myTreasures.get(i).getName().compareTo(nameTreasure.trim()) == 0){
                    myTreasures.remove(myTreasures.get(i));
                    out.println("Указанное сокровище удалено из корзины");
                    break;
                }
            }
        }
        public int getTotalPriceBasket(){
            int sum = 0;
            for (Treasure treasure : myTreasures) sum+=treasure.getPrice();
            return sum;
        }

        public void myTreasureInBasket(){
            myTreasures.forEach(out::println);
            if (myTreasures.size() == 0) out.println("Корзина пуста");
        }
    }
}
