package main.batch_129.day14arraysForeachloops;

import java.util.Arrays;

public class Arrays03 {
    public Arrays03() {
    }

    public static void main(String[] args) {
        String[] colors = new String[]{"Red", "Orange", "Blue", "Yellow", "Green", "Brown"};
        System.out.println(Arrays.toString(colors));
        int counter = 0;
        String[] var3 = colors;
        int var4 = colors.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String w = var3[var5];
            if (w.length() <= 5) {
                ++counter;
            }
        }

        System.out.println(counter);
        int idx = 0;
        String[] newColors = new String[counter];
        String[] var11 = colors;
        int var12 = colors.length;

        for(int var7 = 0; var7 < var12; ++var7) {
            String w = var11[var7];
            if (w.length() <= 5) {
                newColors[idx] = w;
                ++idx;
            }
        }

        System.out.println(Arrays.toString(newColors));
    }
}
