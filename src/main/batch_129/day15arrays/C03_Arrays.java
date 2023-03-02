package main.batch_129.day15arrays;

import java.util.Arrays;

public class C03_Arrays {
    public C03_Arrays() {
    }

    public static void main(String[] args) {
        int[] original = new int[]{0, 2, 3, 0, 12, 0};
        int[] yeni = new int[original.length];
        int idx = 0;

        for(int i = 0; i < original.length; ++i) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                ++idx;
            }
        }

        System.out.println(Arrays.toString(yeni));
    }
}
