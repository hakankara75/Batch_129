package main.batch_129.day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public Md02() {
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{13, 213, 4}, {12, 87}, {4, 7, 1, 9}, {99}};
        System.out.println(Arrays.deepToString(a));
        int sum = 0;
        int[][] var3 = a;
        int var4 = a.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int[] w = var3[var5];
            sum += w.length;
        }

        System.out.println(sum);
    }
}
