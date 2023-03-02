public class HW2 {
    public static void main(String[] args) {


        int a = 55;
        int b = 40;
        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int remainder = a%b;


        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);

        int c=(a%2);
        if (c==0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }


        String grinningFace = "\uD83D\uDE42";

        System.out.println(grinningFace);


    }
}
