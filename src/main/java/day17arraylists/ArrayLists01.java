package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        System.out.println(ages);
//liste coklu eklemek icin once yeni bir list yapıp onları icine ekleriz.
//Veya iki list bir araya nasil getirilir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);//istedigimiz indexe ekleyebiliriz.
        System.out.println(ages);
//bir listdeki butun elemanlari nasil silerim?
        ages.clear();
        System.out.println(ages);
//bir elemanın list de var olup olmadigini nasil kontrol ederiz?
        boolean r= ages.contains(656);
        System.out.println(r);
//bir list in baska bir list ile ayni olup olmadigini kontrol etme
ArrayList<String> names1= new ArrayList<>();
names1.add("Tom");
names1.add("Kim");
names1.add("Jim");
        ArrayList<String> names2= new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        boolean s= names1.equals(names2);
        System.out.println(s);//false


        ArrayList<Integer> nums1 = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean t= nums1.equals(nums2);
        System.out.println(t);//true
    }
}
