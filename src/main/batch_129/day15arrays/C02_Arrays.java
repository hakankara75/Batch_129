package main.batch_129.day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public C02_Arrays() {
    }

    public static void main(String[] args) {
        String str = "java ogrenince para kazanmak,ne kolay,ogrenmeyeyince nekadar zor";
        str = str.toLowerCase();
        String[] harfler = str.split("");
        System.out.println(Arrays.toString(harfler));
        int counter = 0;
        String[] var4 = harfler;
        int var5 = harfler.length;
        int var6 = 0;

        while(var6 < var5) {
            switch (var4[var6]) {
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    ++counter;
                default:
                    ++var6;
            }
        }

        System.out.println(counter);
    }
}
