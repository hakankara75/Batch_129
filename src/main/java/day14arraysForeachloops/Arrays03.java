package day14arraysForeachloops;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
/* ex.1. string bir array olusturun. 6 eleman yerlestirin. character sayisi 5 ten cok olan elemanlari siliniz
 */
String colors[]= new String[6];
colors [0]= "Red";
colors [1]= "Orange";
colors [2]= "Blue";
colors [3]= "Yellow";
colors [4]= "Green";
colors [5]= "Brown";
        System.out.println(Arrays.toString(colors));

/*yeni bir array olusturup character sayisi 5 ve 5 ten kucuk olanlari yeni array e transfe edecegiz.
boylece character sayisi 5 ten buyuk olanlar bu kutuda olmayacak
 /*yeni array in data type i
 yeni array e kac eleman eklenecek
 */
 int counter=0; //character sayisi 6 dan kucuk kac eleman var bu bolumde buluyorum.
        for (String w:colors) {
            if (w.length()<=5){
                counter++; //4
            }

        }
        System.out.println(counter);

//bu bolumde yukarida buldugum character sayisi 6 dan kucuk 4 elemanin sayisini(4) counter ile buraya aktaririz.
        //yeni kutunun eleman sayisi 4 tur. bu elemanlari yerlestirme burada olacak.

        //yeni array olusturma
        int idx=0;//yeni array in indexi. 4 eleman bu index ile sıralanacak. eleman sayisi 5 ve kucuk olanlar alinacak.
String newColors[]= new String[counter];
        for (String w:colors) {
if (w.length()<=5){
    newColors[idx]=w;
    idx++;
}
        }
        System.out.println(Arrays.toString(newColors));

    }
}
