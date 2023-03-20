import java.util.Locale;

public class HW6P2 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
    /* Задача №1
    Дана строка:
    String s = “Перестановочный алгоритм быстрого действия”;
    необходимо вывести все буквы “о” из этой строки.
    Для указанной строки ответ будет “ооооо” (или в столбик)*/
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }

        String s1 = "Перевыборы выбранного президента";
        /*Задача №2
    Дана строка:
    String s = “Перевыборы выбранного президента”;
    необходимо подсчитать количество букв “е” в строке.
    Для указанной строки ответ будет 4.*/
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

        String s2 = "Посмотрите как Рите нравится ритм";
         /*Задача №3
         Дана строка:
         String s = “Посмотрите как Рите нравится ритм”;
         необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                 Для указанной строки ответ будет 6, 15, 29.*/
        s2 = s2.toLowerCase();

        int index = s2.indexOf("рит");
        int index2 = s2.indexOf("рит", index + 1);
        while (index != -1) {
            System.out.println();


        }
        System.out.println(index);
        System.out.println(index2);
        System.out.println(s2.indexOf("рит"));
        System.out.println(s2.indexOf("рит", 6));


        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        /*необходимо подсчитать количество строк в массиве,которые не содержат буквы “е”.*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                /*  if (array.)*/

            }

        }
    }
}
