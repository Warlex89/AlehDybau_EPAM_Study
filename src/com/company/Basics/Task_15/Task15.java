//Составить программу нахождения произведения квадратов первых двухсот чисел
package com.company.Basics.Task_15;
import static java.lang.Math.*;
import static java.lang.System.*;
import java.math.*;

public class Task15 {
    public static void main(String[] args){
        int x = 0;
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 1; i<=200; i++){
            x = (int) pow(i,2);
            s = s.multiply(BigInteger.valueOf(x));
        }
        out.println("Произведение квадратов первых двухсот чисел = "+s);
    }
}
