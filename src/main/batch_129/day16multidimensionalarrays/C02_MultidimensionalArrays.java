package main.batch_129.day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {
    public C02_MultidimensionalArrays() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 5, 1}, {32, 75}};
        int sum = 0;
        System.out.println(Arrays.deepToString(arr));
        int[][] brr = arr;
        int toplam = arr.length;

        int idx;
        int[] crr;
        int var8;
        int var9;
        for(idx = 0; idx < toplam; ++idx) {
            crr = brr[idx];
            int[] var7 = crr;
            var8 = crr.length;

            for(var9 = 0; var9 < var8; ++var9) {
                int k = var7[var9];
                sum += k;
            }
        }

        System.out.println(sum);
        brr = new int[][]{{2, 5, 1}, {32, 75}};
        toplam = 0;
        System.out.println(Arrays.deepToString(brr));
        int[][] var15 = brr;
        int var16 = brr.length;

        for(int var17 = 0; var17 < var16; ++var17) {
            int[] w = var15[var17];
            toplam += w.length;
        }

        System.out.println(toplam);
        idx = 0;
        crr = new int[toplam];
        int[][] var18 = brr;
        var8 = brr.length;

        for(var9 = 0; var9 < var8; ++var9) {
            int[] w = var18[var9];
            int[] var11 = w;
            int var12 = w.length;

            for(int var13 = 0; var13 < var12; ++var13) {
                int k = var11[var13];
                crr[idx] = k;
                ++idx;
            }
        }

        System.out.println(Arrays.toString(crr));
    }
}
