package com.company.Classes.Task_13;
import java.util.ArrayList;

public class Country {
   public String name;
   public Region capitalRegion;
   public ArrayList<Region> regions;

   public Country(String name, Region capitalRegion, ArrayList<Region> regions) {
      this.name = name;
      this.capitalRegion = capitalRegion;
      this.regions = regions;
   }

   public void CapitalCityName(){
      System.out.println("Столица страны: "+capitalRegion.mainDistrict().city().name());
   }

   public void totalArea(){
      int totalArea = 0;
      for (Region region : regions){
         totalArea+=region.area();
      }
      System.out.println("Общая площадь страны = "+totalArea);
   }

   public void regionNumber(){
      System.out.println("Количество областей в стране = "+regions.size());
   }

   public void regionMainCityName(){
      for(Region region : regions){
         System.out.println(region.name()+" область. Областной центр - "+region.mainDistrict().city().name());
      }
   }
}
