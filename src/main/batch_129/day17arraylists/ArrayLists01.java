package main.batch_129.day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    public ArrayLists01() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList();
        System.out.println(ages);
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        System.out.println(ages);
        ArrayList<Integer> newAges = new ArrayList();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);
        ages.clear();
        System.out.println(ages);
        boolean r = ages.contains(656);
        System.out.println(r);
        ArrayList<String> names1 = new ArrayList();
        names1.add("Tom");
        names1.add("Kim");
        names1.add("Jim");
        ArrayList<String> names2 = new ArrayList();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");
        boolean s = names1.equals(names2);
        System.out.println(s);
        ArrayList<Integer> nums1 = new ArrayList();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ArrayList<Integer> nums2 = new ArrayList();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean t = nums1.equals(nums2);
        System.out.println(t);
    }
}
