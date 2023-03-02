package main.batch_129.day16multidimensionalarrays.wrapperclassoperator1.day16multidimensionalarray;

import java.util.Scanner;

public class AritmeticOperator {
    public AritmeticOperator() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = input.nextInt();
        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 * sayi2);
        System.out.println(sayi1 / sayi2);
        int et = 50;
        int yumurta = 30;
        double peynir = 20.0;
        int total = (int)((double)(et + yumurta) + peynir);
        System.out.println("Toplam: " + total + "lira");
    }
}
