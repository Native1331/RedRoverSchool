package ПройденныеУроки;
public class HW5P3 {
    /*  Задача №3

            9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
            8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
            6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
            4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
            2 1 0 1 2
            1 0 1
            0

     */
    public static void main(String[] args) {/*

        for (int i = 9; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("  ");
        for (int k = 8; k > 0; k--) {
            System.out.print(k + " ");
        }
        for (int l = 0; l < 9; l++) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.print("    ");
        for (int m = 7; m > 0; m--) {
            System.out.print( m + " ");
        }
        for (int n = 0; n < 8; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("      ");
        for (int o = 6; o > 0; o--) {
            System.out.print(o + " ");
        }

        for (int p = 0; p < 7; p++) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.print("        ");
        for (int q = 5; q > 0; q--) {
            System.out.print(q + " ");
        }
        for (int r = 0; r < 6; r++) {
            System.out.print(r + " ");
        }
        System.out.println();
        System.out.print("          ");
        for (int i = 4; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("            ");
        for (int i = 3; i > 0; i--) {
            System.out.print( i + " ");

        }
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("              ");
        for (int i = 2; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("                ");
        for (int i = 1; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("  ");
        System.out.print("                 ");
        for (int i = 0; i <= 0; i++) {
            System.out.print(i);

        }*/
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}





























/*





    Задача №3

            9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
            8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
            6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
            4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
            2 1 0 1 2
            1 0 1
            0

}*/
