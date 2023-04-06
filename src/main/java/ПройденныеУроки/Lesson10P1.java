package ПройденныеУроки;
import java.sql.Array;
import java.util.Arrays;

public class Lesson10P1 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 5},
                {3, 8, 2},
                {},
                {6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i);

            }
}
        Integer a = 10;//объект
        int b =50;

        b = a;
        a = a + a;
        a.doubleValue();
              //  String str = "Sergey"
                //str.indexOf("e")-выдаст 2


        Long l= 10L;
        long L= 1;

        Double D = 10.0;
        double d = 1;


        int[] arr1 = new int []{1,2,3,4};
        /* int[] arr = new int[]{1,2,3,4};
           int[] arr2 = arr;
           arr2[0]=100;
           System.out.println(Arrays.toString(arr)); //будет arr2

         */
        String str ="Hello";
        str = "Hi";
    }
}

       /* int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println(min);
        }
    }
}*/
