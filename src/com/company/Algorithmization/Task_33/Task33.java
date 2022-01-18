package com.company.Algorithmization.Task_33;import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Task33 {
    public static void main(String[] args) {
    Random random = new Random();
    List<Integer> inAr = new ArrayList<>();
    List<Integer> fromAr = new ArrayList<>();
    int n, m, l, x;
    int[] array;
    int[] array1;
    int[] sum;
    boolean st;
    Scanner sc = new Scanner(in);
    out.println("Введите размер первого массива ");
    n = sc.nextInt();
    array = new int[n];
    out.println("Введите размер второго массива ");
    m = sc.nextInt();
    array1 = new int[m];
    sum = new int [array1.length+array.length];
    // Создаём последовательность действительных чисел для первого массива
    x = array.length;
    for (int i = 0; i < array.length; i++) {
        st = random.nextBoolean();
        if (!st) x = (-x);
        l = (int) (random() * x);
        array[i] = l;
    }
    Arrays.sort(array);
    for (int element : array) inAr.add(element);
    // Создаём последовательность действительных чисел для второго массива
    x = array1.length;
    for (int i = 0; i < array1.length; i++) {
        st = random.nextBoolean();
        if (!st) x = (-x);
        l = (int) (random() * x);
        array1[i] = l;
    }
    Arrays.sort(array1);
    for (int element : array1) fromAr.add(element);
    List<Integer> indexes = gimmeIndexes(inAr, fromAr);
    arraycopy(array,0,sum,0,n);
    arraycopy(array1,0,sum,n,m);
    Arrays.sort(sum);
    out.println("Получен первый массив " + Arrays.toString(array));
    out.println("Получен второй массив " + Arrays.toString(array1));
    out.println("Куда нужно вставлять, с учетом вставки слева направо " + indexes);
    out.println("Получен итоговый массив " + Arrays.toString(sum));
}
    private static List<Integer> gimmeIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }
}




