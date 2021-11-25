package com.company.Classes.Task_12;
import static java.lang.System.out;
import java.util.ArrayList;

public class Car {
    public String name;
    public int fuel;
    public int road;
    public ArrayList<Wheel> wheels;
    public Engine engine;


    public Car(String name, int fuel, ArrayList<Wheel> wheels, Engine engine) {
        this.name = name;
        this.fuel = fuel;
        this.wheels = wheels;
        this.engine = engine;
        this.road = 0;
    }

    public void wheelsEqual(){
        boolean x = false;
        for(int i = 1; i<wheels.size(); i++){
            if (wheels.get(i-1).equals(wheels.get(i))) x = true;
            else {
                x = false;
                break;
            }
        }
        if(x) out.println("Колёса одного диаметра");
        else out.println("Колёса разных диаметров");
    }

    public void run(){
        int counter = 0;
        while (fuel > 1){
          try{
             fuel--;
             counter++;
             Thread.sleep(1000/engine.getVolume());
             if(counter == 10){
                 road++;
                 counter = 0;
             }
          } catch (InterruptedException e){ }
         out.println("Машина едет: " + "Пробег(км) = "+road+" Уровень топлива = "+fuel);
     }
        out.println("Топливо закончилось, заправьтесь!");
    }

    public void reFuel(int newFuel){
       this.fuel += newFuel;
       out.println("Машина заправлена на "+newFuel+" литров");
    }

    public void wheelChange(ArrayList<Wheel> wheels){
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return String.format("Марка автомобиля: %s",name);
    }
}
