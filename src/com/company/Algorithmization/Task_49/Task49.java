package com.company.Algorithmization.Task_49;
import java.util.*;
import static java.lang.System.*;

public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность");
        out.println("Введите число до которого необходимо искать ");
        createArmArrays(sc.nextInt());
    }
    public static void createArmArrays(int k){
        List<Integer> resultArr = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            List<Integer> simpleArr = sumNumbers(i);
            boolean exNumber = false;
                for (int j = 1; j < simpleArr.size(); j++) {
                    if (simpleArr.get(j) == simpleArr.get(j-1) + 1) exNumber = true;
                    else{
                            exNumber = false;
                            break;
                    }
                }
                if (exNumber) resultArr.add(i);
        }
        out.println(resultArr);
    }
    public static List<Integer> sumNumbers (int n){
        List<Integer> arNumb = new ArrayList<>();
        List<Integer> finArNumb = new ArrayList<>();
        for (; n > 0; n/=10) arNumb.add(n%10);
        for (int i = arNumb.size() - 1; i >= 0 ;i--) finArNumb.add(arNumb.get(i));
        return finArNumb;
    }
}
