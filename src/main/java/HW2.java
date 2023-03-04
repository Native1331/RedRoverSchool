public class HW2 {
    public static void main(String[] args) {


        int a = 55;
        int b = 40;
        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int remainder = a%b;
        byte f = (byte) 128;


        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);
        System.out.println(a*1.0/b);//a*1.0 станет типом double либо а+0
        //Приведение типа- double d = (double)3.1;
        //System.out.println(double(a/b)); Плохая практика-лучше так не делать
        System.out.println("a mod b = " + a % b); //Остаток от деления
        System.out.println("a is odd "+ a % 2);
        System.out.println("b is odd "+ b % 2);

        int c=(a%2);
        if (c==0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }



        System.out.println("\uD83D\uDE00");


    }
}
