public class Lesson7 {
    public static void main(String[] args) {
       /* int a = 0; //унарные операторы-у них один оперант
        a++;//1
        a--;//-1
        System.out.println(a);*/

        for (int i = 0; i<16; i++) {
            if (i == 7) {
              //  break;
                continue;// в этом случае если =7 перепрыгнет, перейдет сразу к 8
            }
            System.out.println(i);
        }
        for (int i=0; i<16; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("int i" +i+", int j"+j);// 75 раз 16итераций по 2 раза
            }

            }
        }
}
