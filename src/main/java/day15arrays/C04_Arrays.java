package day15arrays;

public class C04_Arrays {
    public static void main(String[] args) {
/* Bir Array in icinde herhangi bir elemanin  olup olmadigini  kontrol eden ve kac
kere tekrarlandigini gosteren kodu yaziniz */

int arr[]= {5, 1,5,-3};
int eleman= 5;
int sayac=0;
        for (int w : arr) {
            if (w==eleman){
                sayac ++;
            }
        }
if (sayac>0){
    System.out.println(eleman+" Array de "+sayac+" defa var.");
}else System.out.println(eleman+" Array de yok.");










    }
}
