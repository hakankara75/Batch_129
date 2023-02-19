package main.batch_129.day35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    //1)Konsoldaki liste elemanlarını, ardışık iki
    // eleman arasında boşluk bırakarak aynı satıra yazdırmak için bir method oluşturun. (structered)
    public static void main(String[] args) {
/*
Lambda da java nin hazirladigi methodlari farkli versiyonlarla kullanacagiz.
lambda da kendimiz method yazmayacagiz.
Kendi yazdigimiz kodlar her senaryo icin calismayabilir o nedenle java nin kodlari bu sorunu halleder.
Lambda (functional programing)= methodlari kullanarak kod yazmadir. digerleri "structured programing" dir.
Method un ismine bakinca ne ise yaradigini anlariz. Cunku kodu goremedigimizden oradan ne oldugunu anlamayiz.
yani Lambda (functional programing) "ne oldugu" ile ilgilenir "nasil oldugu" ile ilgilenmez.
Lambda (functional programing) "ne yapmak gerekir" ile ilgilenir "nasil yapmak gerekir" ile ilgilenmez.
Lambda (functional programing), collectionlar ve array lerde kullanilir.
Lambda (functional programing) java ya java 8 de eklendi.
       */
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElement1(nums); //12 9 131 14 9 10 4 12 15
        System.out.println();
        printElement2(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();
        printEvenElements1( nums); // 12 14 10 4 12
        System.out.println();
        printEvenElements2( nums); // 12 14 10 4 12
        System.out.println();
        printSquareOfOddElements( nums); // 81 17161 81 225
        System.out.println();
        printCubeOfDistinctOddElements( nums); // 729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements( nums);
        System.out.println();
        printSProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1( nums); // 131
        System.out.println();
        getMaxValue2( nums);// 131
        System.out.println();
        getMaxValue3( nums);// 131
        System.out.println();
        getMinValue1(nums); // 4
        System.out.println();
        getMinValue2(nums); //4
        System.out.println();
        getMinValue3(nums); //4
        System.out.println();
        getMinValue4(nums); //4
        System.out.println();
        getMinGreaterThanSevenEven( nums); // 10
        System.out.println();
    }

    //1)Konsoldaki liste elemanlarını, ardışık iki
    // eleman arasında boşluk bırakarak aynı satıra yazdırmak için bir method oluşturun. (structered)

    public static void printElement1(List<Integer> nums){

        for (Integer w: nums){
            System.out.print(w+" ");
        }
    }


    //1)Konsoldaki liste elemanlarını, ardışık iki
    // eleman arasında boşluk bırakarak aynı satıra yazdırmak için bir method oluşturun. (functional)

    public static void printElement2(List<Integer> nums){
        nums.
                stream().
                forEach(t-> System.out.print(t + " "));
//nums, variable dir. stream int elemanlari list i stream a cevirir yukaridan asagi akis yapiyor.
//t yani nums in her bir elemanini t icina at. -> her zaman bu sekilde olacak.
    }
    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer> nums){

        for (Integer w:nums){

            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }
//4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(functional)

    public static void printEvenElements2(List<Integer> nums){

        nums.
                stream().
                filter(t -> t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }
/* 5)Create a method to print the square of odd list elements on the console
 in the same line with a space between two consecutive elements.
5- Bir Listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran methodu olustur
*/

    public static void printSquareOfOddElements(List<Integer> nums){

        nums.
                stream().
                filter(t-> t%2!=0). //filtreleyip tekleri verdi
                map(t-> t*t). // var olan elemani al degistir (set) methodu gibi
                forEach(t-> System.out.print(t+" "));
    }
    /*
    6- Create a method to print the "cube" of "distinct" (TEKRARSIZ) "odd" list elements on
    the console in the same line with a space between two consecutive elements.
    6- Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni
    satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
     */
    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().  //tekrarsiz yap. buraya koyduk ki alt satirda az islem yapilsin
                filter(t-> t%2!=0).
                // distinct(). buraya da koyulabilirdi
                        map(t-> t*t*t). //set yani degistir
                // distinct(). buraya da koyulabilirdi
                        forEach(t-> System.out.print(t+" "));
    }
    /*
    7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    7-tekrarsiz elemanlarin karelerinin toplamlarini bulan kodu yaziniz. (Functional)

     */
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum= nums.
                stream().
                distinct().
                filter(t-> t%2==0).
                map(t->t*t).
                reduce(0, (t,u)->t+u); // reduce() coklu degerleri azaltmak icin kullanilir.
        //reduce(0,(t,u)->t+u);==> basta toplam=0, "t ve u degeri verecegiz sana java ve sen onlari toplayacaksin."
        System.out.print(sum); //456
    }
    /*
    8)Create a method to calculate the "product"(carpim) of the "square" of "distinct" "even" (cift sayi) elements
    8-Tekrarsiz cift sayilarin kuplerini hesaplayan methodu yaziniz.
     */
    public static void printSProductOfSquareOfDistinctEvenElements(List<Integer> nums){

        Integer product= nums.
                stream().
                distinct().
                filter(t-> t%2==0).
                map(t->t*t).
                reduce(1, (t,u)->t+u);//carpma islemi oldugu icin t ye ilk deger 1 verdik
        System.out.print(product); //457
    }
    //9)Create a method to find the "maximum value" from the list elements
    // buyuk degeri bulan methodu yazin
    public static void getMaxValue1(List<Integer> nums){
/*
maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
 */
        int max= nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t,u)->t>u ? t:u);
        //t ilk degeri min.value den alir. o da -28 milyondur. sonra u listeden ilk degeri alir.
        //buyuk deger t ye atanir sonra u listeden siradaki elemani alir
        System.out.print(max); // 131
    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums){

        int max= nums.
                stream().
                distinct().
                reduce(nums.get(0), (t,u)->t>u ? t:u);
        //t ilk degeri list den 0. elemandan alir.  sonra u listeden ilk degeri alir.
        //buyuk deger t ye atanir sonra u listeden siradaki elemani alir
        //yukaridaki islemden farki fazladan bir islem yapacak. get methodu ile listeden eleman getirecek.
        //oysa yukarida hazir methodu kullanacak.
        System.out.print(max); // 131
    }

    //   3.yol
    public static void getMaxValue3(List<Integer> nums){

        Integer max= nums.
                stream().
                distinct().
                sorted().//sort kucukten buyuge siraladi. listenin en sonundaki en buyuk sayi
                        reduce( (t,u)->u).// 2 sayi gordugunde 2. yi sec. cunku t listedeki en kucugu aldi. u ondan buyuk olacak.
                        get(); //get methodu optional integer i normal integer a cevirir

        System.out.print(max); // 131
    }

    //10)Create a method to find the minimum value from the list elements
    public static void getMinValue1(List<Integer> nums){

        Integer min=nums.
                stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).
                get();
        System.out.print(min);
    }

    //2.yol
    public static void getMinValue2(List<Integer> nums){

        Integer min=(nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t,u) ->u).
                get());
        System.out.print(min);
    }

    //3.yol
    public static void getMinValue3(List<Integer> nums){

        Integer min=nums.
                stream().
                distinct().
                sorted().
                reduce((t,u) ->t).
                get();
        System.out.print(min);
    }

    //4.yol
    public static void getMinValue4(List<Integer> nums){

        Integer min=nums.
                stream().
                distinct().
                reduce((t,u) ->Math.min(t,u)).get();
        System.out.print(min);
    }

//11)Create a method to find the minimum value which is greater than 7 and even from the list
//   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
//11-7den buyuk cift olan ve en kucuk sayiyi bulan methodu olusturun

    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer min=nums.
                stream().
                filter(t->t>7 &&t%2==0).
                sorted().
                reduce((t,u)->t).
                get();
        System.out.print(min);
    }
}