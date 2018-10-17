//Второй вариант Второе задание

import  java.util.ArrayList;
import java.util.Random;

public class Generation {
    public static void main(String[] args) {

        int A = 100 + (int) (Math.random() * (1000 - 100));
        int A1 = A/100;
        System.out.println(A);

        int B = 100 + (int) (Math.random() * (1000 - 100));
        int B1 = B/100;
        System.out.println(B);

        int C = 100 + (int) (Math.random() * (1000 - 100));
        int C1 = C/100;
        System.out.println(C);

        int Z = A1+B1+C1;
        System.out.println(Z);

    }

    }
