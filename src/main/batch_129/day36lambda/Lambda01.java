package main.batch_129.day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Lambda01 {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Suleyman", "Ebubekir", "Ayse", "Ada", "Okan", "Semih",
                "Gulsen", "Ali", "Zeynep", "Semih", "bilal", "Abdullah", "Abdulkadir"));
        alfBykTkrsz(isimler);
        System.out.println();
        chrctrBykTkrsz(isimler);
        System.out.println();
        alfKckByk(isimler);
        System.out.println();
        harfSay7dnAz(isimler);
        System.out.println();
        wIleBslynlr(isimler);
        System.out.println();
        xIleBtn(isimler);
        System.out.println();
        krktrEnBykElmn(isimler);
        System.out.println();
        snHrfIlkHrfHrc(isimler);
        System.out.println();
        krktrSysCftKrRkrszBykKck(isimler);
        System.out.println();


    }//main

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBykTkrsz(List<String> isimler) {
        isimler.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }


    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrctrBykTkrsz(List<String> isimler) {
        isimler.
                stream().
                distinct(). //benzersiz
                map(String::length).// lengthf karakter sayisini aliyor.
                sorted(Comparator.reverseOrder()). //ters sirali
                forEach(t -> System.out.println(t + " "));

    }

    // Task-3 : List elemanlarini, character sayisina gore kucukten buyuk e gore print ediniz..
    public static void alfKckByk(List<String> isimler) {
        isimler.
                stream().
                sorted(Comparator.comparing(String::length)). /* :: length i tum string lere uygulayarak character
                sayisina gore taradi. length karakter sayisini aliyor.
          */
                    forEach(t -> System.out.print(t + " "));
    }


    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
    // 1.yol
    public static void elmnYedi(List<String> isimler) {
        isimler.
                stream().
                map(String::length). // length ile her bir string in karakter sayisini aldi
                filter(t -> t <= 7). //7 den kucuk olanlari aldi
                forEach(t -> System.out.print(t + " "));
    }

    //2.yol
    /*
allMatch( ) Mukemmeliyetcidir.butun elemanlar
true dondururse sonuc true doner.1 eleman alse olsa sonuc false dondurur
anyMatch( ) en az bir true dondururse sonucu true dondurur
noneMatch( ) hic bir eleman sarti saglamiyorsa true dondurur; 1 tanesi saglasa false dondurur

 */
    public static void harfSay7dnAz(List<String> isimler) {
        System.out.println(isimler.
                stream().
                allMatch(t -> t.length() <= 7) ? "list elemanlari 7 ve 7'den daha az harften olusuyor." :
                "list elemanlari 7 harften buyuk.");

    }

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBslynlr(List<String> isimler) {
        System.out.println(isimler.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "w harfi ile baslayan isim bulunmamaktadir" : "w harfi ile baslayan isimler");
    }


    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.
    public static void xIleBtn(List<String> isimler) {
        System.out.println(isimler.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "x harfi ile biten isimler" : "x harfi ile biten isim bulunmamaktadir");
    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void krktrEnBykElmn(List<String> isimler) {
        Stream<String> sonIsım = isimler.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()). //tostring ile list i string e cevirdik karsilastirdik
                        reversed()).
                limit(1); //limit metodu  Stream<String> class indan gelir. o nedenle sonucu o tur bir kaba koyduk
        //limit ile listeden kac tane string i yazdiracaginizi secersiniz. 3 yazsaydik pes pese 3 string i yazdirirdi
        System.out.println(sonIsım.toArray()); //toarray ile yukarida string yaptigimiz listeyi tekrar array yaptik
    }


    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.
    public static void snHrfIlkHrfHrc(List<String> isimler) {
        isimler.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(1).
                forEach(t -> System.out.println(t + " "));

    }
    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz


    public static void krktrSysCftKrRkrszBykKck(List<String> isimler) {
        isimler.
                stream().
                filter(t -> t.length() % 2 == 0).
                map(t -> t.length() * t.length()). //var olan elemani al degistir (set) methodu gibi
                distinct(). // essiz olanlari al, aynisi olanlari teke dusur
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.println(t + " "));

    }


}//class