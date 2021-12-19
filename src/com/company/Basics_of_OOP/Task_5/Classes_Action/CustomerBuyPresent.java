package com.company.Basics_of_OOP.Task_5.Classes_Action;
import com.company.Basics_of_OOP.Task_5.Classes_Information.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import static java.lang.System.*;

public class CustomerBuyPresent {
    Present present;
    Wrap wrap;
    Candy candyToPresent;
    ArrayList<Candy> candies;
    Customer customer;
    Scanner sc;

    public CustomerBuyPresent() {
        this.candies = new ArrayList<>();
        this.customer = new Customer();
        this.sc = new Scanner(in);
        readTextCandy();
    }

    public void readTextCandy(){
        try{
            FileReader fileReader =
                    new FileReader("src/com/company/Basics_of_OOP/Task_5/Resources/Resources.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String[] candyLine = scanner.nextLine().split(" - ");
                try {
                    String productName = candyLine[0];
                    double price = Double.parseDouble(candyLine[1]);
                    String typeOfCandy = candyLine[2];
                    candies.add(new Candy(productName,price,typeOfCandy));
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void chooseCandy(){
        String name = sc.nextLine();
        boolean non = true;
            for(Candy candy : candies){
                if(candy.productName().toLowerCase(Locale.ROOT).
                        compareTo(name.trim().toLowerCase(Locale.ROOT)) == 0){
                    candyToPresent = candy;
                    non = false;
                    break;
                }
            }
            if (non){
                out.println("Такой сладости нет в ассортименте, выберите другую");
                chooseCandy();
            }
    }

    public void chooseWrap(){
        out.println("Какой тип упаковки вы предпочтёте? ");
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        out.println("1 - из картона");
        out.println("2 - из металла");
        out.println("3 - из фольги");
        out.println("4 - из пластика");
        int option = checkInputOption();
        switch (option){
            case 1 -> wrap = new Wrap(WrapType.CARDBOARD_BOX);
            case 2 -> wrap = new Wrap(WrapType.METAL_BOX);
            case 3 -> wrap = new Wrap(WrapType.FOIL_POUCHES);
            case 4 -> wrap = new Wrap(WrapType.PLASTIC_BAG);
        }
    }

    private int checkInputOption(){
        Pattern pattern = Pattern.compile("[1-4]");
        sc.useDelimiter("[\r\n]");
        while (!sc.hasNext(pattern)){
            sc.nextLine();
            out.println("Неправильное число. Введите 1, 2, 3 или 4");
        }
        return sc.nextInt();
    }

    public void printAllCandies(){
        candies.forEach(out::println);
    }

    public void buildPresent(){
        present = new Present(wrap, candyToPresent);
    }

    public void setPresentToCustomer(){ customer.setPresent(present);}

    public Customer getCustomer() { return customer;}

    public boolean choice(String choice){
        return choice.trim().toLowerCase().compareTo("да") == 0;
    }
}
