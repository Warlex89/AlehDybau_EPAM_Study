package com.company.Algorithmization.Task_40;
import java.util.Scanner;
import java.math.BigInteger;
import static java.lang.System.*;

public class Task40 {

    public static void main(String[] args){
        Task40 tsk = new Task40();
        int a, b, c, nOD;
        Scanner sc = new Scanner(in);
        out.println("Введите значение переменной а ");
        a = sc.nextInt();
        out.println("Введите значение переменной b ");
        b = sc.nextInt();
        out.println("Введите значение переменной c ");
        c = sc.nextInt();
        nOD = tsk.NOD(a,b,c);
        if (nOD != 1){
            out.println("Указанные числа не являются взаимно простыми");
        } else out.println("Указанные числа взаимно простые");
    }
    public static int NOD(int a, int b, int c) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger c1 = BigInteger.valueOf(c);
        BigInteger gcd1 = a1.gcd(b1);
        BigInteger gcd2 = c1.gcd(gcd1);
        return gcd2.intValue();
    }
}
