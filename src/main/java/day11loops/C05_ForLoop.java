package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
//5 den 10 a kadar tamsayilarin toplamini bulan kodu yaziniz.
short add=0;
        for (int i = 5; i < 11; i++) {
            add+=i;
        }
        System.out.println("Toplam sonucu: " +add);

//6 dan 3 e kadar olan tamsayilarin carpimini bulan kodu yaziniz.
        short multiplication=1;
        for (int i = 6; i >3 ; i--) {
            multiplication*=i;
        }
        System.out.println("Carpma sonucu: "+ multiplication);
//Bir tamsayinin rakamlarinin toplamini bulan kodu yaziniz.
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int a= input.nextInt();
        a=Math.abs(a);//kullanici - verebilir diye Math.abs ile pozitif yaptik
        int sonuc=0;
        for (int i = a; i >0; i=i/10) {//baslangici a verdim. boylece ilk sagdaki i degeri pozitif tamsayi oldu.
            //ortadaki i yi 0 dan buyuk yaptim. cunku kullanicinin verdigi soldaki i 0 dan buyuk. calisma sarti olustu.
//ilk dongude i yi 10 boldum. sonuc 254 olur. int oldugu icin virgul olmaz, bolum kalana bakmaz. bunu asagi sonuca yollar.
//2. dongude i yi 10 boldum. sonuc 25 olur. int oldugu icin virgul olmaz, bolum kalana bakmaz. bunu asagi sonuca yollar.

            sonuc=sonuc+i%10;//i yi 10 a bolunce sondaki rakam kalan olur. 2543 un 3 u sonuca eklenir.
        }                   //ikinci turda i=254 tur. % ile 4 alinir.
                           //ikinci turda i=2 dir. % ile 2 alinir.
        System.out.println(sonuc);
    }
}
