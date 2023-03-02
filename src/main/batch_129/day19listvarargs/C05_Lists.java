package main.batch_129.day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Lists {
    public C05_Lists() {
    }

    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi yaziniz");
        int sayi = input.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("Lutfen 1 den buyuk bir sayi giriniz");
        } else {
            while(true) {
                if ((Integer)fibonacci.get(i) >= sayi) {
                    if ((Integer)fibonacci.get(fibonacci.size() - 1) > sayi) {
                        fibonacci.remove(fibonacci.size() - 1);
                        System.out.println("Girdiginiz sayi Fibonacchi sayisi degildir. Girilen sayiya kadar dizi" + fibonacci);
                    } else {
                        System.out.println("Girdiginiz sayi Fibonacchi dizisinde bulunmaktadir.");
                    }
                    break;
                }

                fibonacci.add((Integer)fibonacci.get(i) + (Integer)fibonacci.get(i - 1));
                ++i;
            }
        }

    }
}
