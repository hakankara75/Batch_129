package main.batch_129.day36lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
  Universite u1=new Universite("hacettepe", "fizik", 1200, 88);
  Universite u2=new Universite("bogazici", "qa", 1589, 90);
  Universite u3=new Universite("odtu", "developer", 110, 92);
  Universite u4=new Universite("marmara", "matematik", 1520, 74);
  Universite u5=new Universite("ege", "elektrikelektronik", 2574, 71);
  Universite u6=new Universite("ankara", "hukuk", 1000, 85);
  Universite u7=new Universite("ataturk", "edebiyat", 1700, 62);
  Universite u8=new Universite("istanbul", "matematik", 120, 59);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5, u6, u7,u8));
        System.out.println("tum universitelerin not ortalamasi 75 ten buyuk mu?");
        System.out.println(notOrt75tenByk(unv));
        System.out.println("Universitelerden herhangi birinde matematik bolumu var mi?");
        System.out.println(mtmtkVarmi(unv));//true
        System.out.println("Universiteleri ogrenci sayilarina gore buyukten kucuge siralanmasi");
        System.out.println(ogrncSylrBykKc(unv));
        System.out.println("universitelerde matematik bolumu olanların sayisini ");
        System.out.println(matematikBolmSys(unv));
        System.out.println("Universitelerden ogrenci sayisi 555 ten fazla olanlardan en buyuk notOrtalamasi");
        System.out.println(ogrngSyll555Fzl(unv));
                System.out.println("Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrtalamsi");
        System.out.println(ogrngSyll1050Az(unv));
        }

// Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu
// gosteren bir program olusturunuz.
        public static boolean notOrt75tenByk(List<Universite> unv){
            return unv.
                    stream().
                    allMatch(t->t.getNotOrtalamasi()>75);

        }

// Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden
//  bir program olusturunuz.

    public static boolean mtmtkVarmi(List<Universite> unv){
        return unv.
                stream().
                anyMatch(t->t.getBolum().
                        toLowerCase().
                        contains("matematik"));
/* 2.yol
        anyMatch(t->t.equalIgnoreCase("matematik")); */
    }
    //Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan  bir program olusturunuz.
    public static List<Universite> ogrncSylrBykKc(List<Universite> unv){
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).
                        reversed()).
                collect(Collectors.toList());//Stream yapisindaki datalar List haline getirildi
    }


//Task 04-->"matematik" bolumlerinin sayisini  print ediniz.
public static int matematikBolmSys(List<Universite> unv) {
    return (int) unv.
            stream().
            filter(t -> t.getBolum().equalsIgnoreCase("matematik")).
            count(); //sayma islemi yapar. adet verir
}
//Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static OptionalInt ogrngSyll555Fzl(List<Universite> unv) {//optionalint exception atma riskine karsi
        //javayi susturur. .max methoduna java exception cte si verir. bu onu susturur.
        return unv.
                stream().filter(t-> t.getOgrenciSayisi()>550).mapToInt(t->t.getNotOrtalamasi()).max();
    }

//Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
public static OptionalInt ogrngSyll1050Az(List<Universite> unv) {
    return unv.
            stream().
            filter(t-> t.getOgrenciSayisi()<1050).
            mapToInt(t->t.getNotOrtalamasi()).
            min();//exception verme riski var. o nedenle metot OptionalInt return eder
}

}