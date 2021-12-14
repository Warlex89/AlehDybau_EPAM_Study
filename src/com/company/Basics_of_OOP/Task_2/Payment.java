package com.company.Basics_of_OOP.Task_2;
import java.util.ArrayList;
import static java.lang.System.*;

public class Payment {
    Shop shop;
    FoodBasket foodBasket;

    public Payment() {
        this.shop = new Shop("Звёздочка");
        this.foodBasket  = new FoodBasket();
    }

    public double myPayment(double balance){
        if(balance >= foodBasket.getTotalPriceBasket()
                && foodBasket.getTotalPriceBasket() != 0){
            balance = balance - foodBasket.getTotalPriceBasket();
            out.println(String.format("Стоимость покупки:  %.2f; Остаток на балансе:  %.2f",
                    foodBasket.getTotalPriceBasket(),balance));
        }
        if(foodBasket.getTotalPriceBasket() == 0) out.println("Покупательская корзина пуста, наберите товара ");
        if(balance < foodBasket.getTotalPriceBasket()) out.println("Недостаточно средств на балансе ");
        while (foodBasket.myProduct.size() != 0){
            for (int i = 0; i < foodBasket.myProduct.size(); i++){
                foodBasket.myProduct.remove(foodBasket.myProduct.get(i));
            }
        }
        return balance;
    }

    class FoodBasket {
        ArrayList<Product> myProduct = new ArrayList<>();

        public void addProductToMyBasket(String nameProduct){
            boolean non = true;
            for (Product product : Payment.this.shop.products){
                if(product.getName().compareTo(nameProduct.trim()) == 0){
                    myProduct.add(product);
                    out.println("Указанный продукт добавлен в вашу корзину");
                    non = false;
                }
            }
            if (non) out.println("Указанного товара нет в магазине");
        }

        public void removeProductFromMyBasket(String nameProduct){
            for (int i = 0; i < myProduct.size(); i++){
                if(myProduct.get(i).getName().compareTo(nameProduct.trim()) == 0){
                    myProduct.remove(myProduct.get(i));
                    out.println("Указанный продукт удалён из вашей корзины");
                }
            }
        }

        public double getTotalPriceBasket(){
            double sum = 0;
            for (Product product : myProduct) sum+=product.getPrice();
            return sum;
        }

        public void myProductInBasket(){
            myProduct.forEach(out::println);
            if (myProduct.size() == 0) out.println("Покупательская корзина пуста");
        }

        public void allShopProduct(){
            Payment.this.shop.outAllProducts();
        }

    }
}
