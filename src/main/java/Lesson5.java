public class Lesson5 {
    public static void main(String[] args) {
        int sum = 1234;
        if (sum<10 && sum>=1) { //Сумма меньше десяти или больше и равна 1
            System.out.println("one digit");
            //Должно выполниться хотя бы одно else if
        }else if(sum<100 && sum>=10){
            System.out.println("two digit");
        }else  if(sum<1000 && sum>=100){
            System.out.println("three digit");
        }else  if(sum<10000 && sum>=1000){
        System.out.println("four digit");
    }else{
            System.out.println("Nothing");
        }
        }
    }

