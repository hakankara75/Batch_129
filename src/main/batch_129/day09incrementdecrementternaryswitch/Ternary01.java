package main.batch_129.day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int r1= a<7 ? a++ : b++;
        int r2= a<7 ? a++ : ++b;
        System.out.println(r1);//20
        System.out.println(r2);//22
        System.out.println(a);//10
        System.out.println(b);//21
//Ex 2 verilen sayinin mutlak degerini hesaplayin
        int c=-4;
        int r3= c<0? -1*c: c;
        System.out.println(r3);//4
//ex 3 iki sayinin isaretleri ayni ise bu sayilari carpan, farkli ise "farkli isaretli sayilari carpamiyorum"
// mesaji veren kodu yaziniz
        int m=5;
        int n= 6;
        Object r4=(m<0 && n<0) ||(m>0 && n>0)? m*n: "farkli isaretli sayilari carpamiyorum";//data tipleri farkli ise
//yani basta int sayilar carpiliyor, sonucta string var, burda object kullanilir.
        System.out.println("sonuc: " + r4);

// size verilen sayinin 3 basamakli olup olmadigini kontrol edin
        int p=-436;
        int r=Math.abs(p);
        String r5= r>99 && r<1000? p+ " uc basamakli sayi" : p+ " uc basamakli sayi degil";
        System.out.println(r5);
    }
}
