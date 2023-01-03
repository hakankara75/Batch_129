package day16multidimensionalarray.wrapperclassoperator1;

import java.util.Scanner;

public class AritmeticOperator {
    public static void main(String[] args) {
//kullanicidan iki sayi isteyin. aritmetik islemi gerceklestirin.
Scanner input=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1=input.nextInt();

        System.out.println("2. sayiyi giriniz");
        int sayi2=input.nextInt();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);
//gunluk masrafinizi toplayiniz
        int et= 50;
        int yumurta=30;
        double peynir=20;
//double total=et+yumurta+peynir;
        int total= (int)(et+yumurta+peynir);
        System.out.println("Toplam: "+ total+ "lira");
    }
}
