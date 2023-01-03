package day14arraysForeachloops;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
/* string array olusturun. icine 5 eleman ekleyin. ilk eleman ile son elemanin
icerdigi karakter sayilari toplamini ekrana yazdirin.
 */
        String  arr[]= new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="Englis";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//Math,Science,Music,Englis,Art
        System.out.println(arr[0].length()+ arr[arr.length-1].length());//7

/* string array olusturun. icine 5 eleman ekleyin. tum elemanlarin
icerdigi karakter sayilari toplamini ekrana yazdirin.
 */
        String  brr[]= new String[5];
        arr[0]="Miami";
        arr[1]="Istanbul";
        arr[2]="Ffankfurt";
        arr[3]="Dhaka";
        arr[4]="Athena";

        int totalChar=0;
        for (int i = 0; i < brr.length; i++) {
            totalChar=totalChar+ brr[i].length();

        }System.out.println(totalChar);//33
//.2.yol for each loop (enhanced loop) baslangic degeri,
// loop un calisma sarti ve increment decrement kismini kendi halleder.
//array lerde ve collectionlarda kullanilir.
//index kullanmaniz gerektiginde for each loop caresiz kalir. diger loop lari kullanirsiniz.

        int sum=0;
for (String w:brr) {//data tipi, variable, array in ismi yazilir
    sum = sum + w.length();
}
        System.out.println(sum);//33

    }
}
