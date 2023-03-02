package main.batch_129.day16multidimensionalarrays;

public class Md05 {
    public Md05() {
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{2, 5}, {4, 7, 11}};
        int carpim = 1;
        int[][] var3 = a;
        int var4 = a.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int[] w = var3[var5];
            int[] var7 = w;
            int var8 = w.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int k = var7[var9];
                carpim *= k;
            }
        }

        System.out.println(carpim);
    }
}

