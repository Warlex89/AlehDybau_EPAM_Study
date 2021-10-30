package com.company.Algorithmization.Task_36;
import java.util.Scanner;
import java.math.BigInteger;
import static java.lang.System.*;

public class Task36 {
    public static void main(String[] args){
        int a, b, c, d, nOD;
        Task36 tsk = new Task36();
        Scanner sc = new Scanner(in);
        out.println("Введите значение переменной а ");
        a = sc.nextInt();
        out.println("Введите значение переменной b ");
        b = sc.nextInt();
        out.println("Введите значение переменной c ");
        c = sc.nextInt();
        out.println("Введите значение переменной d ");
        d = sc.nextInt();
        nOD = tsk.NOD(d,tsk.NOD(c,tsk.NOD(a,b)));
        out.println("Наименьший общий делитель = "+nOD);
    }
    public static int NOD(int a, int b) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger gcd = a1.gcd(b1);
        return gcd.intValue();
    }
}
