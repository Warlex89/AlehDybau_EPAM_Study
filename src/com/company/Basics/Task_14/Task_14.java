//Найти сумму квадратов первых ста чисел
package com.company.Basics.Task_14;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Task_14 {
    public static void main(String[] args){
        int x = 0;
        for(int i = 1; i<=100; i++){
            x = (int) (x+pow(i,2));
        }
        out.println("Сумма квадратов первых ста чисел = "+x);
    }
}
