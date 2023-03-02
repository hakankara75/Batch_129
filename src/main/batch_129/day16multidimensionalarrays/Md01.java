package main.batch_129.day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public Md01() {
    }

    public static void main(String[] args) {
        int[][] a = new int[3][2];
        System.out.println(Arrays.deepToString(a));
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.toString(a[2]));
        System.out.println(a[1][0]);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(a[2][1]);
    }
}
