package advanced_practice.practice03;

import java.util.Scanner;

public class Q06_ForLoop_Continue {
    public static void main(String[] args) {
/*Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.*/
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("bir tamsayi giriniz");
            int num = input.nextInt();

            if (num > 5 && num < 10) {
                System.out.println("girdiginiz sayi 5 ile 10 arasindadir. toplama dahil olmayacaktir");
                continue;
            }
            toplam += num;//loop her bittiginde sayi ekleniyor.
        }
        System.out.println("Toplam: "+toplam);
    }
}
