import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введи слово  ");
        String st = sc.next();

        System.out.println("Введи число раз повторений  ");
        int n = sc.nextInt();

        int i = 0;
        while (i<n){
            System.out.println(st);
            i++;
        }
    }
}
