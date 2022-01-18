package com.company.Tasks.Task_4.Class_Act;
import com.company.Tasks.Task_4.Class_Inf.Ship;

public class PierLoader implements Runnable {
    public Port port;

    public PierLoader(Port port) {
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                Ship ship = port.get();
                if(ship!=null)
                    while (ship.countCheck()){
                        Thread.sleep(100);
                        ship.add(10);
                        System.out.println(ship.getCount() + " Корабль загружен. " + Thread.currentThread().getName());
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}