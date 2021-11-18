package com.company.Classes.Task_7;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Triangle {
    Side A;
    Side B;
    Side C;

    public Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    public static Triangle createTriangle(Point a, Point b, Point c){
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(c, a);
        return new Triangle(A,B,C);
    }

    public double calcPerimeter(){
        return A.calcSide() + B.calcSide() + C.calcSide();
    }

    public double calcArea() {
        double p = calcPerimeter() / 2;
        return Math.sqrt(p * (p - A.calcSide()) * (p - B.calcSide()) * (p - C.calcSide()));
    }

    public Point pointMedian() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("Введите точку х(А) ");
        int xA = sc.nextInt();
        out.println("Введите точку у(А)");
        int yA = sc.nextInt();
        Point a = new Point(xA, yA);

        out.println("Введите точку х(B) ");
        int xB = sc.nextInt();
        out.println("Введите точку у(B)");
        int yB = sc.nextInt();
        Point b = new Point(xB,yB);

        out.println("Введите точку х(C) ");
        int xC = sc.nextInt();
        out.println("Введите точку у(C)");
        int yC = sc.nextInt();
        Point c = new Point(xC,yC);

        Triangle triangle = createTriangle(a,b,c);
        int choice = 4;
        out.println("Введите 1 чтобы посчитать периметра треугольника");
        out.println("Введите 2 чтобы посчитать площадь треугольника");
        out.println("Введите 3 чтобы посчитать точки пересечения медиан");
        out.println("Для выхода из программы нажмите 0");
        while (choice !=0){
            out.println("Введите команду ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> out.printf(Locale.US,"Периметр треугольника = %.1f %n",triangle.calcPerimeter());
                case 2 -> out.printf(Locale.US, "Площадь треугольника = %.1f %n",triangle.calcArea());
                case 3 -> {
                    Point z = triangle.pointMedian();
                    out.printf(Locale.US,"Точка пересечения медиан = (%.1f, %.1f) %n", z.getX(),z.getY());
                }
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда");
            }
        }
    }
}
