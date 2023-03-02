package main.batch_129.day11loops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {
/* asagida gordugunuz sekli konsola yazdiran kodu olusturun.
X X X X X
X X X X X
X X X X X
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz");
        int satir= input.nextInt();
        System.out.println("Lutfen sutun  sayisi giriniz");
        int sutun= input.nextInt();
        for (int i = 1; i <=satir ; i++) {
            String str= "";

            for (int j = 1; j <= sutun; j++) {
                str= str+"X ";

            }System.out.println(str);
        }

    }
}
