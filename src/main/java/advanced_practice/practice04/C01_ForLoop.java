package advanced_practice.practice04;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
/* kullanicidan alacaginiz bir string degerde 'c' den onceki 'a' harfinin string
deger icerisinde kac kez gectigini bulan kodu yaziniz.
 */
        Scanner input= new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str= input.nextLine().toLowerCase();

        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("c oncesi a larin sayisi: "+sayac);


    }
}
