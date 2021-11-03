package com.company.Algorithmization.Task_38;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Task38 {
    public static void main(String[] args) {
        int n, array[][], l;
        Scanner sc = new Scanner(in);
        out.println("Введите количество точек ");
        n = sc.nextInt();
        array = new int[2][n];
        out.println("Получен следующий массив с координатами точек, где первое число в столбце равно х, а второе у ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                l = (int) (random() * n);
                array[i][j] = l;
                out.print(" " + array[i][j] + " ");
            }
            out.println();
        }
        Result(array,n);
    }
    public static void Result(int[][] ar, int n){
        int [][] array = ar;
        int[] x = new int[n];
        int[] y = new int[n];
        int dist[][], valDist,max = 0;
        for (int j = 0; j < n; j++){
            x[j] = array[0][j];
            y[j] = array[1][j];
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                valDist = Distance(x[i], y[i], x[j], y[j]);
                max = (valDist > max) ? valDist : max;
            }
        }
        out.println("Максимальное расстояние между точками равно "+max);
        out.println("Максимальное расстояние выявлено между точками со следующими координатами:");
        dist = new int[2][2];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                valDist = Distance(x[i], y[i], x[j], y[j]);
                if (valDist == max){
                    dist[0][0] = x[i];
                    dist[0][1] = y[i];
                    dist[1][0] = x[j];
                    dist[1][1] = y[j];
                    out.println(Arrays.deepToString(dist));
                }
            }
        }
    }
    public static int Distance(int x2, int y2, int x1, int y1){
        int distance = (int) sqrt(pow(x1 - x2,2) + pow(y1 - y2,2));
        return distance;
    }
}
