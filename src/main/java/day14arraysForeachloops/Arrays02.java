package day14arraysForeachloops;

import java.util.Arrays;

public class Arrays02 {
public static void main(String[] args) {
/* Ex.2 int array olusturun. 6 eleman yerlestirin. bu elemanlarin en kucugu ile
en buyugunun toplamini ekrana yazdiriniz
 */
int ages[]= new int[6];
ages[0] =20;
ages[1] =23;
ages[2] =19;
ages[3] =44;
ages[4] =15;
ages[5] =32;

    System.out.println(Arrays.toString(ages));

//1.yol
Arrays.sort(ages);//kucukten buyuge siraladi
    System.out.println(Arrays.toString(ages));

    System.out.println(ages[0]+ ages[ages.length-1]);

//2.yol
int minimum= ages[0];//tek tek elemanlari karsilastirip en kucugu bulmak icin herhangi birini kutuya koydum
    int maximum= ages[0];
    for (int w:ages) {
        minimum= Math.min(minimum,w);
        maximum= Math.min(maximum,w);
        System.out.println(minimum);
        System.out.println(maximum);
    }
    System.out.println(minimum+maximum);






    }
}
