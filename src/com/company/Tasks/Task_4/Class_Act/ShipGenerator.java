package com.company.Tasks.Task_4.Class_Act;
import com.company.Tasks.Task_4.Class_Inf.Ship;
import com.company.Tasks.Task_4.Class_Inf.Size;
import java.util.Random;

public class ShipGenerator implements Runnable {

    public Port port;
    public int shipCount;

    public ShipGenerator(Port port, int shipCount) {
        this.port = port;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < shipCount) {
            Thread.currentThread().setName("Генератор корабля");
            count++;
            port.add(new Ship(getRandomSize()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
