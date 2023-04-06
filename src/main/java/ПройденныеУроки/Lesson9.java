package ПройденныеУроки;
public class Lesson9 {
    public static void main(String[] args) {
     /* int [] a= new int[1000];
      int a1;
      int a2;
      int a3;
      int a10;*/
    /*    int[] a = new int[1];
        a[0] = 1000;
        System.out.println(a[0]);
        a[1] = 1000;
        System.out.println(a[1]);*/

        char[] string = "Привет".toCharArray();
        char[] str2 = new char[]{'П', 'р', 'и', 'в', 'е', 'т'};
        char[] str3 = new  char[6]; //если мы не знаем сколько букв
        str3[0] = 'П';
        str3[1] = 'р';
        str3[2] = 'и';
        str3[3] = 'в';
        str3[4] = 'е';
        str3[5] = 'т';
        int[][]a = new int[3][10];

        System.out.println(a.length);

        for (int i = 0; i<a.length; i++){
            int[] b = a[i];
            for (int j=0; j<b.length; j++){
                System.out.println(b[j]);
                System.out.println((a[i]) [j]);
            }

            System.out.println(string[i]);
            System.out.println();

        }

     /* for (int i=0; i<1000; i++){
          a[i]= i;
          System.out.println(a[i]);
      }
        int sum = 0;
        for (int i=0; i<1000; i++) {
            sum += a[i];
        }
            System.out.println(sum/1000);
        }


    /*    for (int a = 1; a < 10; a++) {
            System.out.println("Читаем для множителя" + a);
            for (int b = 0; a % 2 == 0; b++) {
                System.out.println(a + "х" + b + "=" + (a * b));

            }*/
    }
}


