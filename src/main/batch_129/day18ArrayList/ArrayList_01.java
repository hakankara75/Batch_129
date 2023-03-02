package main.batch_129.day18ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {
//Array List Olusturma
        List <Integer> nums= new ArrayList<>();
//Arraylistler nasil yazdirilir?
        System.out.println(nums);//[]
//Arraylistler e nasil eleman eklenir?
        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
//Arraylistler in bos olup olmadigini nasil anlariz?
        boolean bosmu1=nums.isEmpty();
        System.out.println("bos mu?: "+bosmu1);//true

        List <Integer> ages= new ArrayList<>();
        boolean bosmu2=ages.isEmpty();
        System.out.println("bos mu?: "+bosmu2);//true

        /* nums array list indeki sayilari 11 artirdiktan sonra ekrana yazdirin */

        for (Integer w:nums) {//w ile sayilar tek tek alinir
            if (w%2!=0){//sayilarin tek olup olmadigina bakilir
                nums.set(nums.indexOf(w),    w+11); //w sayisinin indexini getir ve set ile o indexe 11 ekle
            }
        }System.out.println(nums);

/*Örnek
        nums Array listinden 52 rakaminin gorunumunu siliniz */
        // nums.remove(52);//hatali kod. bu kod 52. indexi sildirir
        Integer sayi= 52; //wrapper class a cevirdik
        nums.remove(sayi);
        System.out.println("nums"+ nums);
//NOT: remove method una tamsayi yazarsaniz java onu index olarak kabul eder.
//tum tamsayilar java icin primitive data type dir. primitive ler list in elemani olamaz.
//listlerde kullanabilmek icin primitive leri wrapper a donustururuz.
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names); //names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]


        //Ex non primitive silme
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a= "+a);
        a.remove("Shoes");
        System.out.println("a= "+a);

//Array list de coklu datanin olup olmadigini nasil gosteririz? containsAll()
// containsAll() : Bir listin icinde coklu elemanin olup olmadigini kontrol eder
// Hepsi varsa true; en az bir tanesi yoksa false verir.
        List<String> myNames = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames: "+myNames);
        List<String> varMi = new ArrayList<>();//kontrol edecegimiz isimleri yeni liste olusturup ekleriz
        varMi.add("Burcu");
        varMi.add("Can");
        varMi.add("Gul");
        boolean sonuc= myNames.containsAll(varMi);//ilk listeye containsAll ile bakip kontrol listesi varMi yi ekleriz
        System.out.println(sonuc);
    }
}
