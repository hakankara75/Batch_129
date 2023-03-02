package main.batch_129.day14arraysForeachloops;

import java.util.Arrays;

public class Arrays01 {
    public Arrays01() {
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"Math", "Science", "Music", "Englis", "Art"};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length - 1].length());
        String[] brr = new String[5];
        arr[0] = "Miami";
        arr[1] = "Istanbul";
        arr[2] = "Ffankfurt";
        arr[3] = "Dhaka";
        arr[4] = "Athena";
        int totalChar = 0;

        int sum;
        for(sum = 0; sum < brr.length; ++sum) {
            totalChar += brr[sum].length();
        }

        System.out.println(totalChar);
        sum = 0;
        String[] var5 = brr;
        int var6 = brr.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String w = var5[var7];
            sum += w.length();
        }

        System.out.println(sum);
    }
}
