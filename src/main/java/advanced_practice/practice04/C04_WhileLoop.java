package advanced_practice.practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
/* Kullanicidan toplanmak uzere sayilar isteyin sayi adedi 10'u gecerse veya toplam 500 'u gecerse bu kadar sayi yeter
     ".. adet sayi girdin, toplami..." yazdirin */
Scanner input = new Scanner(System.in);
        int a []= new int[10];
        int b=0;
        int counter=0;
        for (int i = 0; i <a.length; i++) {
            System.out.println("Rakam girin");
            a [i]=input.nextInt();
            b = b + a[i];
            counter=i+1;
            if(b>=500){break;}
               }System.out.println("Daha fazla rakam giremezsiniz");
        System.out.println( counter + " Adet sayı girdin: " + Arrays.toString(a));
        System.out.println("Rakamlarin toplami: " +b);

//2.yol
       // Scanner input = new Scanner(System.in);
        int sayi=0;
        int toplam= 0;
        int sayac=0;

        while (sayac<11 && toplam<501){
            System.out.println("toplamak icin sayi yaziniz");
            sayi= input.nextInt();
            sayac++;
        }
if (toplam>500){
    System.out.println(sayi+ "adet sayi girdiniz. Toplami "+toplam);
}else
    System.out.println("Bu kadar sayi yeter. "+sayac+" adet sayi girdiniz. Toplam "+toplam);


    }
}
