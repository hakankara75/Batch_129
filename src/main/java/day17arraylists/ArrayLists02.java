package day17arraylists;
import java.util.List;
import java.util.ArrayList;
public class ArrayLists02 {
    public static void main(String[] args) {
//ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz
//Ama sol tarafa ister "ArrayList" yazin isterseniz "List" yazin, ikisi de calisir.
//"List" Hz. Adem dir. ArrayList kendi babanın ismidir.

        List<Character> initials= new ArrayList<>();
initials.add('A');
initials.add('B');
initials.add('A');//Listler de tekrar eden eleman yazilabilir. yani eleman tekrar tekrar eklenebilir.
initials.add('D');
//Bir list deki eleman sayısını veren metot
        int numOfElement= initials.size();
        System.out.println(numOfElement);//4

char u= initials.get(2);//yukarıda Character non primitive actigimiz icin char kabul etti. autoboxing yapti.
        System.out.println(u);//A


        List<String> cities= new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
//1.yol
        int sum=0;//toplam karakteri bunun icine atacagim

        for (String w: cities) {
            sum= sum+ w.length();//w string oldugu icin length kullandim. size index ile calisir. o nedenle kullanmadim.
        }
        System.out.println(sum);//26
//2.yol
        int toplam=0;
        for (int i=0; i<cities.size(); i++){//4 eleman oldugu icin size indeksi 4 olarak calisir.
            toplam= toplam+cities.get(i).length();//i elemani getirir, length onun uzunlugunu alir.
        }
        System.out.println(toplam);//26

//SET : list deki istenen bir elemani degistirir.
    cities.set(0, "New York");
        System.out.println(cities);//Miami silindi New York eklendi.

//Ex. Maaş listi oluşturunuz   ve maaşlara %20 zam yapınız.
//1.yol
List<Double> salary= new ArrayList<>();
salary.add(19500.25);
salary.add(8500.76);
salary.add(32500.50);

int idx=0;

for (Double w:salary){//for each loop da index olmadigi icin elemani cagirmak icin idx olusturduk.

    salary.set(idx, w*1.20);//set de de index kullanmak zorunlu o nedenle idx olusturduk.

    idx++;
}
        System.out.println(salary);
//2.yol

        for (int i=0; i<salary.size(); i++){//size listedeki eleman sayisini 3 verir
            salary.set(i, salary.get(i)*1.20);
        }
        System.out.println(salary);

    }
}
