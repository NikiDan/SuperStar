//1 Вариант, 2 Задание

import  java.util.ArrayList;
import java.util.Random;

public class Generation {
    public static void main(String[] args) {
        ArrayList<Integer> per = new ArrayList<Integer>();
        int N = 100 + (int) (Math.random() * (1000 - 100));
        int A = N % 10;
        int B = (N % 100) / 10;
        int C = N / 100;

        int max =0;
        System.out.println(N);


        per.add(C);
        per.add(B);
        per.add(A);
        for (int i = 0; i <per.size();i++)
        {
            if (max < per.get(i))
            {
                max=per.get(i);
            }
        }
        System.out.println(max + " - " + "самое большое число");



    }


}