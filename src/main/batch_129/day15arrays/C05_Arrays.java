package main.batch_129.day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public C05_Arrays() {
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"Abdurrahman", "Emre", "Yunus", "Ali", "Mehmet", "Can", "Veli"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        String[] brr = new String[]{"Abdurrahman", "Emre", "Akin", "Asan", "Yunus", "Ali", "Mehmet", "Mustafa", "Can", "Veli"};
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));
    }
}
