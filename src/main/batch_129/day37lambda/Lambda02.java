package main.batch_129.day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        System.out.println("tum cift sayi olan elemanlarin kupleri: ");
        tumCiftSyElmKup(list);
        System.out.println("tum elemanlari topla: ");
        tumElmToplm(list);
        System.out.println("list'deki tum tek sayi olan elemanlarin carpimi");
        tumTekSyCarp(list);
        System.out.println("list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplami");
        ucIleBlnSyIkiFzl(list);
}

//Task 01-->tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz.
public static void tumCiftSyElmKup(List<Integer> list){
list.
        stream().
        filter(Utilities::ciftMi).//t-> t%2==0
        mapToInt(Utilities::kupBul).
forEach(Utilities::yazInt);
        return;
}

    //list'deki tum elemanlarin toplamini ekrana yazdiriniz
    public static void tumElmToplm(List<Integer> list){
        System.out.println(list.
                stream().
                reduce(Utilities::toplam));

    }



    //list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz
    public static void tumTekSyCarp(List<Integer> list){
        System.out.println(list.stream().
                filter(Utilities::tekMi).
                reduce(Utilities::carpim));
    }


    //list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz

    public static void ucIleBlnSyIkiFzl(List<Integer> list){
        System.out.println(list.stream().
                filter(Utilities::uceBolunebilme).
                map(t-> t+2).   // orijinal degeri degistirirken kullaniriz.
                reduce(Utilities::toplam));


    }

    //list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz
}
