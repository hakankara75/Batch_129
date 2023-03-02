package main.batch_129.day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public C01_MultidimensionalArrays() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr));
        int[][] arr2 = new int[][]{{2, 3}, {9}, {78, 6, 4, 5}};
        System.out.println("Hem declare hemde deger atamasi ile " + Arrays.deepToString(arr2));
        System.out.println("Hem declare hemde deger atamasi 2.index  " + Arrays.toString(arr2[2]));
        System.out.println("Hem declare hemde deger atamasi 0.index " + Arrays.toString(arr2[0]));
        System.out.println("Hem declare hemde deger atamasi 1.index " + Arrays.toString(arr2[1]));
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);
        String[][] brr = new String[3][2];
        brr[0][0] = "a";
        brr[0][1] = "b";
        brr[1][0] = "c";
        brr[1][1] = "d";
        brr[2][0] = "e";
        brr[2][1] = "f";
        System.out.println(Arrays.deepToString(brr));
        int sum = 0;
        String[][] var5 = brr;
        int var6 = brr.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String[] w = var5[var7];
            sum += w.length;
        }

        System.out.println(sum);
    }
}
