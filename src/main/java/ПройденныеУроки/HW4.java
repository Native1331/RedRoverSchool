package ПройденныеУроки;
public class HW4 {
    public static void main(String[] args) {
      /*  Задача №1
        Необходимо вывести числа от 0 до 15.

        Задача №2
        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

        Задача №3
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
                Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).*/
        int i;
        for (i = 0; i < 16; i = i + 1) {//for(int i=0; < 16; i = i + 1 )
            System.out.println(i);
        }
        int a;
        for (a = 5; a < 10000; a = a * 5) {
            System.out.println(a);
        }

        int b;
        for (b = 40; b <= 60; b = b + 1) {
            if (i % 4 == 0)
                System.out.println(b);
        }
        for (int c = 40; c <= 60; c = c + 4) {
            System.out.println(c);
        }
      /*  if (b >= 40 || b <= 60) {
            for (b =40/4;  ; b = b + 1) ;
            System.out.println(b);
        }*/
    }
}


