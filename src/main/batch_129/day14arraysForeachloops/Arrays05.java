package main.batch_129.day14arraysForeachloops;

import java.util.Arrays;

public class Arrays05 {
    public Arrays05() {
    }

    public static void main(String[] args) {
        String[] color = new String[]{"Red", "Orange", "Blue", "Yellow", "Green", "Brown"};
        Arrays.sort(color);
        int num = Arrays.binarySearch(color, "Blue");
        System.out.println(num);
        int num1 = Arrays.binarySearch(color, "Orange");
        System.out.println(num);
        int num2 = Arrays.binarySearch(color, "Tarik");
        System.out.println(num);
    }
}
