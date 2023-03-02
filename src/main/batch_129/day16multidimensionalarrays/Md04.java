package main.batch_129.day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public Md04() {
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{2, 5}, {4, 7, 11}};
        int totalElement = 0;
        int[][] var3 = a;
        int idx = a.length;

        for(int var5 = 0; var5 < idx; ++var5) {
            int[] w = var3[var5];
            totalElement += w.length;
        }

        int[] b = new int[totalElement];
        idx = 0;
        int[][] var14 = a;
        int var15 = a.length;

        for(int var7 = 0; var7 < var15; ++var7) {
            int[] w = var14[var7];
            int[] var9 = w;
            int var10 = w.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                int k = var9[var11];
                b[idx] = k;
                ++idx;
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
