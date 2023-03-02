package main.batch_129.day16multidimensionalarrays;

public class Star {
    public Star() {
    }

    public static void main(String[] args) {
        int row = 5;

        for(int i = 1; i <= row; ++i) {
            int m;
            for(m = i; m < row; ++m) {
                System.out.print(" ");
            }

            for(m = 1; m <= 2 * i - 1; ++m) {
                if (i != row && m != 1 && m != 2 * i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
