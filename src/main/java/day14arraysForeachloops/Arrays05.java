package day14arraysForeachloops;

import java.util.Arrays;

public class Arrays05 {
public static void main(String[] args) {
//sort method u sayisal data type lerini kucukten buyuge siralar (ascending order)
//sort method u string data type lerini alfabetik buyuge siralar (alphabetical order)
//ascending order+alphabetical order==>   natural order
//sort method u elemanlari  natural order o gore siralar.

//binarySearch() method u bir elemanin array icinde olup olmadigini kontrol eder.
//binarySearch() method u kullanmadan once sort () kullanilir.
    String color[]= new String[6];
    color [0]= "Red";
    color [1]= "Orange";
    color [2]= "Blue";
    color [3]= "Yellow";
    color [4]= "Green";
    color [5]= "Brown";
    Arrays.sort(color);//siraladi
    int num= Arrays.binarySearch(color, "Blue");//Blue sordurk. kacinci index diye
    System.out.println(num);//0 inci eleman Blue

    int num1= Arrays.binarySearch(color, "Orange");
    System.out.println(num);//var indexi 3

    int num2= Arrays.binarySearch(color, "Tarik");
    System.out.println(num);//-6. eksi demek yok demek. 6 ise olsaydi 6. eleman olurdu. T harfinden dolayi 6. olur.








    }
}
