import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 значения: ");
        String st = sc.next();
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();

        System.out.println("Введите действие * + - / ");
        char d = sc.next().charAt(0);

        double rez;
        switch (d) {
            case '+':
                rez = n1 + n2;
                System.out.println(rez);
                break;
            case '-':
                rez = n1 - n2;
                System.out.println(rez);
                break;
            case '*':
                rez = n1 * n2;
                System.out.println(rez);
                break;
            case '/':
                rez = n1 / n2;
                System.out.println(rez);
                break;
        }
    }

}
