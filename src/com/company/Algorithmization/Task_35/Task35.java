package com.company.Algorithmization.Task_35;
import java.util.Scanner;
import java.math.BigInteger;
import static java.lang.System.*;

public class Task35 {
    public static void main(String[] args){
        int a, b, nOD, nOK;
        Scanner sc = new Scanner(in);
        out.println("Введите значение переменной а ");
        a = sc.nextInt();
        out.println("Введите значение переменной b ");
        b = sc.nextInt();
        nOD = NOD(a,b);
        nOK = NOK(a,b,nOD);
        out.println("Наименьший общий делитель = "+nOD);
        out.println("Наименьшее общее кратное = "+nOK);
    }
    public static int NOD(int a, int b) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger gcd = a1.gcd(b1);
        return gcd.intValue();
    }
    public static int NOK(int a, int b, int nOD){
        int nOK1 = a * b / nOD;
        return nOK1;
    }
}
