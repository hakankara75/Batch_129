package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
//3 ten 10 kadar tamsayilari ayni satira yazdiran kodu yaziniz.

        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
//2. yol
int i=3; //baslangic degeri
while (i<11){//bitis degeri
    System.out.print(i+ " ");
    i++;//artirma while loop un icinde
    }
        System.out.println();
//17 den 4 e kadar tum cift sayilari yan yana yazdiran kodu yaziniz
      int  k=17;
while (k>3){
    if (k%2==0){
        System.out.print(k+" ");

    }k--;
}
}
}