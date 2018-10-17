//1 Вариант, 1 Задание


public class Massiv
{
    public static void main(String[] args) {

        int[] MyList = new int[10];

        MyList [1] = 9;
        MyList [2] = 1;
        MyList [3] = 2;
        MyList [4] = 3;
        MyList [5] = 4;
        MyList [6] = 5;
        MyList [7] = 6;
        MyList [8] = 7;
        MyList [9] = 8;



        // Вывести на экран все элементы массива

        for (int i=0; i < MyList.length; i++)
        {
            System.out.println(MyList[i] + " ");
        }

        // Вывести на экран сумму элементов

        int Summa = 0;

        for (int i = 0; i<MyList.length; i++)
        {
            Summa += MyList[i];
        }
            System.out.println("Сумма чисел массива:" + Summa);

        // Нахождение в массиве наибольшего числа

        int Max = MyList [0];
         for (int i = 1; i< MyList.length; i++)
         {
             if (MyList[i] > Max) Max = MyList[i];
         }

         System.out.println("Наибольший элемент:" + Max);

    }
}
