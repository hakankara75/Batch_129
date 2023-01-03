package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Lists {
    public static void main(String[] args) {
    /*
      INTERWIEW
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        List<Integer> fibonacci= new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi yaziniz");
int sayi= input.nextInt();
fibonacci.add(0);
fibonacci.add(1);
int i=1;
if (sayi<=1){
    System.out.println("Lutfen 1 den buyuk bir sayi giriniz");
}else {
while (fibonacci.get(i)<sayi){ //son eleman dista kalmamasi icin i=1 oldu. index sorunu.
   fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));//bir onceki eleman ile topla. boylece 0. index dahil oldu
    i++;
}if (fibonacci.get(fibonacci.size()-1)>sayi){
    fibonacci.remove(fibonacci.size()-1);
            System.out.println("Girdiginiz sayi Fibonacchi sayisi degildir. Girilen sayiya kadar dizi"+fibonacci);
        }else
            System.out.println("Girdiginiz sayi Fibonacchi dizisinde bulunmaktadir.");




}
}
}