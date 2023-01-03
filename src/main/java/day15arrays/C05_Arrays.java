package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {
/* Arama motorunda "guzel isimler" adlı bir application icin isimleri kucukten buyuge sıralayan kodu yazınız */
        String arr[]={"Abdurrahman", "Emre", "Yunus", "Ali", "Mehmet", "Can", "Veli"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length));//karsilatirilacak olan rakam oldugu icin int aldik
        System.out.println(Arrays.toString(arr));

/*String array elemanlarini karakter sayisina gore ve natural order(alfafabetik sira)`a gore ve tersten
buyukten kucuge siralayiniz
 */
        String brr[] = {"Abdurrahman","Emre","Akin","Asan","Yunus","Ali","Mehmet","Mustafa","Can","Veli"};

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));
    }

}

