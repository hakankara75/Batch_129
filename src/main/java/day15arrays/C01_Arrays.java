package day15arrays;
import java.util.*;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {
        /* bir ogretmenin okulundaki ogrencilerin isimlerini application a yuklemesini saglayan kodu yaziniz */
        Scanner input= new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStd= input.nextInt();
        String names []= new String[numOfStd];
        System.out.println("cikmak istiyorsaniz lutfen q harfine basiniz");
        for(int i= 1; i <=numOfStd ; i++){
            System.out.println("Lutfen " +i+ " ogrencinin ismini giriniz");
            String stdNames= input.next();
            if (stdNames.equalsIgnoreCase("q")){
                break;
            }
            names[i-1]=stdNames;//names 0 dan basladigi icin i-1 yapip hem 0 dan baslattik hem dinamik yaptik.
    }
        System.out.println(Arrays.toString(names));


    }


}
