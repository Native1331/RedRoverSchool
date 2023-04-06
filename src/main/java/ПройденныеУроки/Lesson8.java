package ПройденныеУроки;
import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
 /*       int a = 10;
        int b = a;
        b = 5;
       int[] array = {10, 100, 1000, 10000, 100000};//все элементы массива int-домогенные, однородные
      массивы имутабл-не изменяемые-в плане длины массивы. Двумерные массивы и одномерные
        System.out.println( array[1]);
        System.out.println(array.length);
        System.out.println(a);// не ссылочный, будет 10

        int[] arr1 = {10, 100, 1000, 10000};
        int[] arr2 = arr1;
        arr2[0] = 20;//в нулевой элемент 20
        //  int[] arr3 ={}
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + " -> " + arr1[i]);
        }
        System.out.println(arr1[0]);//ссылочный тип будет 20
        System.out.println(arr1);//ссылка на массив
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr1));
    }*/
       //2 ой вариант:
        int[] arr = new int[6];
        int p=1;
        for(int i = 0;i<arr.length; i++) {
        arr[i] = p;
        p*=5;
        }
        System.out.println(Arrays.toString(arr));

      /*  int[] arr = new int[6]; //массив с размером 6 элементов
        // int[] arr = new int []{1,2,3,4};-переменные
        //  int[] arr = new int [100000]; //0 по умолчанию, тысяча нулей
        for (int i = 0; p = 1; i < arr.length; p *= 5; i++) {
            arr[i] = p;
        }
        System.out.println(Arrays.toString(arr));*/
        int[][] arr3 = {//двумерный массив
                {1,10,100},
                {2,20,200},
                {3,30,300}};
        System.out.println(arr3.length);
        int [][] arr4 = {//рванный массив
                {1,10,100},
                {2,20},
                {3,30,300,400}};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println();

            }
            System.out.println(arr[i]);
        }
        System.out.println(arr4.length);
        System.out.println(Arrays.deepToString(arr4));
        System.out.println();

        };
    }



