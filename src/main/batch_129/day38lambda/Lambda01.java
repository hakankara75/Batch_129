package main.batch_129.day38lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList)); // 60
        System.out.println(getSumFrom7To70()); // 2464
        System.out.println(getMultiplicationFrom3To9()); // 181440
        System.out.println(getMultiplicationFrom3To9Two()); // 181440
        System.out.println(getFactoriyel(5)); // 120
        System.out.println(getSumOfEvenBetweenTwoInt(5,14)); // 36
        System.out.println(getSumOfDigitBetweenTwoInt(13,18)); // 26





    }

    //SORU1: verilen list deki tum sayilarin toplamini veren methodu olusturun

    public static int getSumOfAllElements(List<Integer> myList) {

        return myList.stream().reduce(Math::addExact).get();

    }

    // 7 den 70 e kadar tum sayilarin toplamini veren kodu yaziniz
    public static int getSumFrom7To70() {

        return  IntStream. // liste halinde verilmeyen gorevlerde java aralıktaki verileri olusturur.
                rangeClosed(7, 70). // iki sayi arasi sayilar dahil. range olursa ilk dahil ikincisi haric olur.
                reduce(Math::addExact).
                getAsInt(); // intstream kullaninca get yerine bu kullanilir.
 }

    // 3 den 9 a kadar tum tam sayilarin carpimini veren kodu yaziniz
    public static int getMultiplicationFrom3To9() {

        return  IntStream. // liste halinde verilmeyen gorevlerde java aralıktaki verileri olusturur.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt(); // intstream kullaninca get yerine bu kullanilir.
    }
    public static int getMultiplicationFrom3To9Two() {

        return  IntStream.
                range(3, 10). //yukarida rangeclosed oldu. ikinci sayi 9 idi. burada dahil olmadigindan 10 oldu
                reduce(Math::multiplyExact).
                getAsInt();
    }
    // verilen sayinin faktoriyelini hesaplayan kodu yaziniz
    public static int getFactoriyel(int x) {
        // kullanicinin hata ile negatif sayi verme ihtimaline karsi if li kod yazariz
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

// verilen 2 tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz
        public static int getSumOfEvenBetweenTwoInt(int a, int b) {
            //kullanicinin hatali sekilde girmesi (ikinci sayiyi ilk sayidan kucuk yazmasi) if li kod yazariz
            if (a>b)   {
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.
                        range(a+1,b).// ilk sayi goreve gore dahil olmayacagindan 1 sonrasini aldik.
                    filter(Utils::isNumberEven).
                    sum();

            }

// size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz
public static int getSumOfDigitBetweenTwoInt(int a, int b) {
    if (a>b)   {
        int temp=a;
        a=b;
        b=temp;
    }
return IntStream.range(a+1,b).
        map(Utils::getSumOfDigits). // map yaptik cunku sayilari tek tek alacak ve sayiyi degistirip bir sonraki
        // sayiya gececek. sayiyi basamak degerlerini toplayip sonraki sayiya gececek.
        sum();

    //utils class i biz olusturup icine method lar koyduk
}




}