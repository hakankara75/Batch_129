package main.batch_129.day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /* kullanicidanbiki sayi ve yapilacak islem olan +,-,/,*,% islemlerini yapan kodu yaziniz.*/
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("yapilacak islemden birini +,-,/,*,%  giriniz");
        char opr = input.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println("a+b sonucu: " + (a+b));
                break;
            case '-':
                System.out.println("a-b sonucu: " + (a-b));
                break;
            case '*':
                System.out.println("a*b sonucu: " + (a*b));
                break;
            case '/':
                System.out.println("a/b sonucu: " + (a/b));
                break;
            case '%':
                System.out.println("a%b sonucu: " + (a%b));
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");

        }

    }

}

