package day16multidimensionalarray;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {
/*Bir array in içindeki data yine array se buna denir.*/
//1.yol Multidimensional Array nasıl oluşturulur
//Bu yontemle inner arrayler sabit olmak zorunda
        int arr[][]=new int[3][2];//auter array
        System.out.println(Arrays.toString(arr));//non primitive oldugu icin [[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.toString(arr[1]));//[0,0]
        System.out.println(Arrays.toString(arr[2]));//[0,0]
        System.out.println(Arrays.deepToString(arr));//multidimensional arreyler bununla yazdirilir.
        //[[0,0],[0,0],[0,0],[0,0]]
//2.yol Multidimensional Array nasıl oluşturulur
        int brr[][]= {{2,3},{9},{78,6,4,5}};//auter array

        System.out.println("hem decrale hem de deger ataması ile "+ Arrays.deepToString(arr));
//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("hem decrale hem de deger ataması ile 0. index"+ Arrays.toString(arr[0]));
//hem decrale hem de deger ataması ile 0. index[2, 3]
        System.out.println("hem decrale hem de deger ataması ile 1. index"+ Arrays.toString(arr[1]));
//hem decrale hem de deger ataması ile 1. index[9]
        System.out.println("hem decrale hem de deger ataması ile 2. index"+ Arrays.toString(arr[2]));
//hem decrale hem de deger ataması ile 2. index[78, 6, 4, 5]
        System.out.println(arr[1][0]);//1. kat, 0. daire

/*Multidimensional Arrays lere eleman ekleme */
        arr[1][0]= 6;
        arr[0][0]= 3;
        arr[0][1]= -4;
        arr[1][1]= 18;
        arr[2][0]= -7;
        arr[2][1]= 0;
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]//Kat ve daire sayısı
        System.out.println(Arrays.toString(arr[1]));//[6, 18]//Daire ve eleman sayısı
        System.out.println(arr[1][0]);// 1. dairedeki 0.eleman: 6
/*multidimensional arrays oluşturun
eleman ekleyin
toplam elemanı yazdırın(loop, burda for each loop olur. Toplaya toplaya gideceğimiz için) */
String crr[][]= new String[3][2];
crr[0][0]="a";
crr[0][1]="b";
crr[1][0]="c";
crr[1][1]="d";
crr[2][0]="e";
crr[2][1]="f";
        System.out.println(Arrays.deepToString(crr)); 	//[[a, b], [c, d], [e, f]]
int sum=0;//toplam kac daire oldugu bilgisi burada
        for (String[] w : crr) {//w=each diye tekslerde gorebiliriz
            sum=sum+w.length;
        }//for loop
        System.out.println(sum);	//6 daire. 0. Katta 2 daire.1.katta 2 daire.2. katta 2 daire. toplam:6

    }
}
