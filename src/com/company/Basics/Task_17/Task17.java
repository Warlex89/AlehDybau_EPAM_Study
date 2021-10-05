//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
package com.company.Basics.Task_17;
import static java.lang.System.*;

public class Task17 {
    public static void main(String[] ars){
        for(int i=32; i<127; i++){
            out.println(i+" = "+(char)i);
        }
    }
}
