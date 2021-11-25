package com.company.Classes.Task_13;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Commands {
    public static void main(String[] args) {
        Region minskRegion = new Region("Минская", new District(new City("Минск")), 1234);
        Region grodnoRegion = new Region("Гродненская", new District(new City("Гродно")), 3454);
        Region vitebskRegion = new Region("Витебская", new District(new City("Витебск")), 4365);
        Region mogilevRegion = new Region("Могилёвская", new District(new City("Могилёв")), 1223);
        Region gomelRegion = new Region("Гомельская", new District(new City("Гомель")), 12837);
        Region brestRegion = new Region("Брестская", new District(new City("Брест")), 3765);
        ArrayList<Region> regions = new ArrayList<>(Arrays.asList(minskRegion,grodnoRegion,vitebskRegion,mogilevRegion,
                gomelRegion,brestRegion));
        Country Belarus = new Country("Беларусь", minskRegion,regions);

        Belarus.CapitalCityName();
        Belarus.regionNumber();
        Belarus.totalArea();
        Belarus.regionMainCityName();
    }
}
