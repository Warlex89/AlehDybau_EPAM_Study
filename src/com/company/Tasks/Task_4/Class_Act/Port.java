package com.company.Tasks.Task_4.Class_Act;
import com.company.Tasks.Task_4.Class_Inf.Ship;
import java.util.ArrayList;
import java.util.List;

public class Port {
    public List<Ship> store;
    private static final int maxShipsInPort = 5;
    private static final int minShipsInPort = 0;
    private int shipsCounter = 0;

    public Port() {
        store = new ArrayList<>();
    }

    public synchronized boolean add(Ship element) {

        try {
            if (shipsCounter < maxShipsInPort) {
                notifyAll();
                store.add(element);
                String info = String.format("%s + Корабль прибыл в порт: %s %s", store.size(),
                        element.getSize(), Thread.currentThread().getName());
                System.out.println(info);
                shipsCounter++;

            } else {
                System.out.println(store.size() +
                        "> В порту нет места для корабля: " + Thread.currentThread().getName());
                wait();
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized Ship get() {
        try {
            if (shipsCounter > minShipsInPort) {
                notifyAll();
                for (Ship ship : store) {
                    shipsCounter--;
                    System.out.println(store.size() + " - Корабль отбыл из порта: " + Thread.currentThread().getName());
                    store.remove(ship);
                    return ship;
                }
            }
            System.out.println("0 < В порту нет кораблей");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}