/*Для данной области составить линейную программу, которая печатает true,
 если точка с координатами (х, у) принадлежит закрашенной области,
 и false — в противном случае
 */
package com.company.Basics.Task_6;
import java.util.Scanner;
import static java.lang.System.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введите значение координаты x ");
        int x = sc.nextInt();
        out.println("Введите значение координаты y ");
        int y = sc.nextInt();
        if (x >= -2 & x <= 2 & y >= -3 & y <= 4) { //рассчёт попадания координат x,y в область -2<=x<=2 и -3<=y<=4
            out.println("координаты принадлежат закрашенной области " + true);
        } else {
            if (x >= -4 & x <= 4 & y >= -3 & y <= 0) { //рассчёт попадания координат x,y в область -4<=x<=4 и -3<=y<=0
                out.println("координаты принадлежат закрашенной области " + true);
            } else {
                out.println("координаты не принадлежат закрашенной области " + false);
            }
        }
    }
}
