package ПройденныеУроки;
import java.util.Locale;

public class Lesson10P2 {
    public static void main(String[] args) {
     /*   String str = "Sergey";
        String str2 = str.toLowerCase();//метод не меняет строку
        str = str.replace('r','!');//функция=действие-замена буквы

        System.out.println(str2);
        System.out.println(str);

        int[] arr = {10, 5, 3, 8, 2, 6};

        int result = arr[0];//Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;-ищет максимальное значение, выше минимальное
        for (int i = 0; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        System.out.println(result);
    }*/

        String str = "Sergey is programmer";
        for (int i = 0; i < str.length(); i++) {


            System.out.print(str.charAt(i));
        }
        int[] arr = {1, 2, 3};
        int[] arr2 = arr;// если arr2 будет {1,2,3}-false, потому что два разных массива

        System.out.println(arr == arr2);
        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);
//старая запись
      /*  int[] arr = {2,6,1,4,7,9};
        for (int i = arr.length-1; i>=0; --i>=0;){
            System.out.println(arr[i]);*/
        }

        }









