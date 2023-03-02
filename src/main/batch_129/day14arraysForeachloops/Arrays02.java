package main.batch_129.day14arraysForeachloops;

import java.util.Arrays;

public class Arrays02 {
    public Arrays02() {
    }

    public static void main(String[] args) {
        int[] ages = new int[]{20, 23, 19, 44, 15, 32};
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);
        int minimum = ages[0];
        int maximum = ages[0];
        int[] var4 = ages;
        int var5 = ages.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int w = var4[var6];
            minimum = Math.min(minimum, w);
            maximum = Math.min(maximum, w);
            System.out.println(minimum);
            System.out.println(maximum);
        }

        System.out.println(minimum + maximum);
    }
}
