package ПройденныеУроки;
public class Lesson3 {
    public static void main(String[] args) {
        //  byte a =(byte)  128;
        int a = 2;
        int b = 1;
        b = a + 1 + a + 2;
        System.out.println("a= " + a);
        if (a == b) {
            System.out.println("Они равны");
        }
            /*
            a > b
            a > = b
            a == b
            a != b
            a < b
            a < = b
            */
        int c = 2 + 1;
        a = b + a + 1;
        a = a + 1;
        System.out.println("a=" + a);
        if (a % 2 != 0) {
            System.out.println("a не четное");
        } else if (a == 8) {
            System.out.println("a = 8");
        } else if (a == 10) {
            System.out.println("a is 10");
        } else {
            System.out.println("a is something else");
        }

        System.out.println("a%2 != 0 is " + (a % 2 == 0));//в этом случае приравнивает к boolean
        //&& "и"
        //||-"или"


        System.out.println("true && false =" + (true && false));        //Если хотя бы одно из них ложь, то все ложь
        System.out.println("true && true = " + (true && true));           //&&-и
        System.out.println("false && true =" + (false && true));
        System.out.println("false && false =" + (false && false));

        System.out.println("=============================================");
        System.out.println("true || false = " + (true || false));       //Если хотя бы одно истина, то в итоге истина
        System.out.println("true || false = " + (true || false));      // ||- или
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false =" + (false || false));

        System.out.println("=============================================");
        System.out.println("!false = "+(!false));
        System.out.println("!true = "+(!true));

        /*  (a == b) || (b == 1 && a>2)
        b == 1-первое
        а>2 -второе
        && - третье
        || - четвертое
         a == b - пятое
         Если без скобок-будет такой же порядок*/
        /* у отрицания ! приоритет над >< если !1<2 то будет сначала искать !1-выдаст, ошибку, отрицание не может
        быть с числом
         */









    }
}