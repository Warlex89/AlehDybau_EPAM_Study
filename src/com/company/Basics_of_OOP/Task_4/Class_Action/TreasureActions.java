package com.company.Basics_of_OOP.Task_4.Class_Action;
import com.company.Basics_of_OOP.Task_4.Class_Information.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.out;

public class TreasureActions {
    private ArrayList<Treasure> treasures;

    public TreasureActions() {
        this.treasures = new ArrayList<>();
        fillListWithTreasure();
    }

    public void fillListWithTreasure(){
      try{
        FileReader fileReader =
                new FileReader("src/com/company/Basics_of_OOP/Task_4/Resources/treasures.txt");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            String[] treasureLine = sc.nextLine().split(" - ");
            String treasureType = treasureLine[0];
            String treasureName = treasureLine[1];
            int treasurePrice = Integer.parseInt(treasureLine[2]);
            String treasureDescription = treasureLine[3];
            switch (treasureType){
                case "Porcelain" -> treasures.add(
                        new Porcelain(treasureName,treasurePrice,treasureType,treasureDescription));
                case "Necklace" -> treasures.add(
                        new Neckless(treasureName,treasurePrice,treasureType,treasureDescription));
                case "Combat Weapon" -> treasures.add(
                        new CombatWeapon(treasureName,treasurePrice,treasureType,treasureDescription));
                case "Coin" -> treasures.add(
                        new Coin(treasureName,treasurePrice,treasureType,treasureDescription));
                case "Gem" -> treasures.add(
                        new Gem(treasureName,treasurePrice,treasureType,treasureDescription));
            }
        }
      }catch (FileNotFoundException e){
       out.println("Сокровищ нет!");
      }
    }

    public void printTreasureList(){
        treasures.forEach(out::println);
    }

    public void printNumberAllTreasure(){
        out.println("Количество сокровищ в пещере дракона =  "+treasures.size());
    }

    public void theMostExpensiveTreasure(){
        Treasure expensiveTreasure = treasures.get(0);
        for (int i = 1; i < treasures.size(); i++){
            expensiveTreasure = (expensiveTreasure.getPrice() < treasures.get(i).getPrice()) ?
                    treasures.get(i) : expensiveTreasure;
        }
        out.println(expensiveTreasure);
    }

    public void sortTreasuresByType(){
        treasures.sort(Comparator.comparing(Treasure::getType));
        out.println("Сокровища успешно отсортированы по типу");
    }

    public void sortTreasuresByName(){
        treasures.sort(Comparator.comparing(Treasure::getName));
        out.println("Сокровища успешно отсортированы по имени");
    }

    public void sortTreasuresByPrice(){
        treasures.sort(Comparator.comparing(Treasure::getPrice));
        out.println("Сокровища успешно отсортированы по стоимости");
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
