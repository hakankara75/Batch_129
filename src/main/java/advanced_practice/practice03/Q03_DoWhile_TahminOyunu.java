package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    public static void main(String[] args) {
/*0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
*/
        Scanner input= new Scanner(System.in);
        int rastgeleSayi=((int)(Math.random()*101));
        //random double verir. o nedenle *101 yaptik. ondalik istemedigimizden int yaptik. paranteze aldik.
int sayi; //do while icinde deklare edilirse sayi taninmaz. o nedenle do while disinda olusturduk.
int sayac=11;
        System.out.println("0-100 arasi bir tam sayi giriniz");

        do {
    sayac--;
sayi=input.nextInt();
if (sayi<rastgeleSayi){
    System.out.println(sayac +" hakkiniz kaldi");
    System.out.println("daha buyuk bir sayi giriniz");

} else if (sayi>rastgeleSayi) {
    System.out.println("daha kucuk bir sayi giriniz");
} else{
    System.out.println("tebrikler."+ (10-sayac)+ "tahminde bulundunuz");
    System.out.println("Puanınız: "+(sayac+1)*10);
}
if (sayi==0)
{
    System.out.println("tahmin hakkiniz bitti");
    break;
}
        }      while (sayi!=rastgeleSayi);//rastgele sayiya esit olmadigi surece calisacak
    }

    }

