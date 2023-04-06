package ПройденныеУроки;
public class Lesson10 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2, 4, 6};
        int[] [] arr1 = {{1, 5}, {3, 8, 2}, {}, {6}};
        //  int arr[] = {1,2,3,4};//некрасиво, но можно

       /* int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if(value>arr[i]) {
                value= arr[i];
            }
        }
        System.out.println(value);*/
        int sum =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <  arr1[i].length; j++) {
                sum += arr1[i][j];
                
            }
            
        }
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
            System.out.println(result);

        }
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];

        }
        System.out.println(sum);


        int count = 0;
        for (
                int i = 0;
                i < arr.length; i++) {
            count++;
            {
                System.out.println(count);
            }
        }

    }
}

