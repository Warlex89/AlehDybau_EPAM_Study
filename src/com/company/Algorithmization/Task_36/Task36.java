package com.company.Algorithmization.Task_36;
import java.util.Scanner;
import java.math.BigInteger;
import static java.lang.System.*;

public class Task36 {
    public static void main(String[] args){
        int a, b, c, d, nOD;
        Scanner sc = new Scanner(in);
        out.println("Введите значение переменной а ");
        a = sc.nextInt();
        out.println("Введите значение переменной b ");
        b = sc.nextInt();
        out.println("Введите значение переменной c ");
        c = sc.nextInt();
        out.println("Введите значение переменной d ");
        d = sc.nextInt();
        nOD = NOD(a,b,c,d);
        out.println("Наименьший общий делитель = "+nOD);
    }
    public static int NOD(int a, int b, int c, int d) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger c1 = BigInteger.valueOf(c);
        BigInteger d1 = BigInteger.valueOf(d);
        BigInteger gcd1 = a1.gcd(b1);
        BigInteger gcd2 = c1.gcd(gcd1);
        BigInteger gcd3 = d1.gcd(gcd2);
        return gcd3.intValue();
    }
}
