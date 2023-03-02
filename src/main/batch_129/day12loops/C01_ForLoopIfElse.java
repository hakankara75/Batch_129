package main.batch_129.day12loops;


import java.util.Scanner;

public class C01_ForLoopIfElse {
    public static void main(String[] args) {
/* kullanicidan baslangic ve bitis degerlerini alin. baslangic degerinden baslayip bitis degerine kadar tum
tamsayilari yazdiriniz.
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic=input.nextInt();
        System.out.println("Lutfen baslangic degerini giriniz");
        int bitis=input.nextInt();
        if (baslangic>bitis){
            System.out.println("verdiginiz deger bitis degerinden kucuk olmali");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                System.out.print(i+ " ");
            }
        }
/* kullanicidan baslangic ve bitis degerlerini alin. baslangic degerinden baslayip bitis degerine kadar tum
cift tamsayilari yazdiriniz.
*/
        System.out.println(" ");
        input= new Scanner(System.in);
        System.out.println("Lutfen ilk degerini giriniz");
        int ilk=input.nextInt();
        System.out.println("Lutfen son degerini giriniz");
        int son=input.nextInt();
        if (baslangic>bitis){
            System.out.println("verdiginiz deger bitis degerinden kucuk olmali");
        }else {
            for (int i = ilk; i <=son ; i++) {
                if (i%2==0){
                    System.out.print(i+ " ");
                }
            }
        }
    }
}