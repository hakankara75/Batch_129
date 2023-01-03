import com.sun.jdi.IntegerValue;

import java.sql.Array;
import java.util.*;

public class Ders {

    public static void main(String[] args) {
       /* TASK:
     tas=1 >makas=2
     makas=2 >kagit=3
     kagit=3 >tas=1
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1-2-3 rakamlarindan birini giriniz.");
        int kullaniciSecimi = input.nextInt();
        int bilgisayarSecimi = (int) (Math.random() * 3);
        int kullaniciPuan = 0;
        int bilgisayarPuan = 0;
        while (true) {
            if (kullaniciSecimi == 1 && bilgisayarSecimi == 2) {
                kullaniciPuan++;
                System.out.println("Kullanici kazandi");
            } else if (kullaniciSecimi == 2 && bilgisayarSecimi == 1) {
                bilgisayarPuan++;
                System.out.println("Bilgisayar kazandi");}
            else{
            break;}
            }
        }
        }

























