import java.sql.Array;

public class HW6P1 {
    public static void main(String[] args) {

   /* Задача №1
       необходимо вывести сумму всех значений массива.
*/

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Array sum is " + sum);
        /*необходимо вывести максимальное значение массива.*/

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Array max is " + max);
        /*Задача №3
         необходимо вывести минимальное значение массива.*/


        int min = array[0];// int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Array min is " + min);
      /*      Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println("Array average is " + sum1 / array1.length);
        System.out.println("============================================================================");
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        /*необходимо вывести сумму элементов массива.*/
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum2 += arr[i][j];
            }
        }
        System.out.println("Arr sum is " + sum2);

        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max1 < arr[i][j]) {
                    max1 = arr[i][j];
                }
            }

            System.out.println("Arr max is " + max1);
        }
            int min1 = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (min1 > arr[i][j]) {
                        min1 = arr[i][j];
                    }
                }
            }
                System.out.println("Arr min is " + max1);

                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        count++;
                    }

                }
                System.out.println(count);
            }

        }









        



