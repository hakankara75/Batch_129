package main.batch_129.day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
//aynı adımlar tekrar tekrar yapilmasi gerektiginde loop lar kullanilir.
//FOR LOOP
//Ex. ekrana 5 kere "Hi" yazdiran kodu yaziniz.
//Parantez icine sol basa ilk olarak baslangic degeri
//Parantez icine loop un calisma sarti
//Parantez icine en saga artirma veya azaltma yapacagimizi belirtiriz.
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }
//Ex. 11 den 44 e kadar tum tamsayilari ekrana yazdiriniz.
        for (int i = 11; i < 45; i++) {
            System.out.println(i);
        }
//Ex. 40 dan 23 e kadar tum cift tamsayilari ekrana yazdiriniz.
        for (int i = 40; i > 22; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }
//Ex. 18 den 56 ya kadar tum tek tamsayilari ekrana yazdiriniz.
        for (int i = 18; i <57; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}