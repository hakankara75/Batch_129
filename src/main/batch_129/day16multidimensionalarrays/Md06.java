package main.batch_129.day16multidimensionalarrays;

public class Md06 {
    public Md06() {
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{21, 5}, {14, 70, 11}};
        int small = a[0][0];
        int big = a[0][0];
        int[][] var4 = a;
        int var5 = a.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int[] w = var4[var6];
            int[] var8 = w;
            int var9 = w.length;

            for(int var10 = 0; var10 < var9; ++var10) {
                int k = var8[var10];
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }

        System.out.println(small + big);
    }
}
