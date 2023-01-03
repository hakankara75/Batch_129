package advanced_practice.practice04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
/*Kullanicidan string bir ifade aliniz.
harflerini alt alta gelecek sekilde yazdirin.
" " bosluk veya 'a' harfi geldiginde yazdirmayan diger karakterleri yazan kodu yaziniz.
 */
        Scanner input= new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str= input.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)== ' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }




}
}
