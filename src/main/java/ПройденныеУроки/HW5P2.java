package ПройденныеУроки;
public class HW5P2 {
    /* Задача №2

             0  1  2  3  4  5  6  7  8  9
             0  1  2  3  4  5  6  7  8
             0  1  2  3  4  5  6  7
             0  1  2  3  4  5  6
             0  1  2  3  4  5
             0  1  2  3  4
             0  1  2  3
             0  1  2
             0  1
             0

     */
    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("  ");

        for (int j = 0; j < 8; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("    ");
        for (int k = 0; k < 7; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("      ");
        for (int l = 0; l < 6; l++) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.print("        ");
        for (int m = 0; m < 5; m++) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.print("          ");
        for (int n = 0; n < 4; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("            ");
        for (int o = 0; o < 3; o++) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.print("              ");
        for (int p = 0; p < 2; p++) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.print("                ");
        for (int q = 0; q < 1; q++) {
            System.out.print(q + " ");
        }




for(int i = 10; i>=0; i--){
    for (int j = 10; j > i; j--) {
        System.out.print("  ");
    }
    for (int j = 0; j < i; j++) {
        System.out.println(j + "  ");
    }
}
}
}