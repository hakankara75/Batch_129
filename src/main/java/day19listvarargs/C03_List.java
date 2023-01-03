package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_List {
    public static void main(String[] args) {
/*Example 2: sayi tahmin oyunu.  oyuncudan 1-10 arasi bir sayi isteyin. elinizdeki listede oyuncunun verdigi sayi
varsa "BINGO" yazdirin. yoksa verdigi sayiyi listenize ekleyiniz. ilk bingoyu tamamlayana "KAZANDINIZ" yazdirin

[5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
[5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
[5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
 */
        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("5");
        c.add("8");
        c.add("2");
        c.add("9");
        System.out.println("c = " + c);//c =c = [5, 8, 2, 9]
        String sayi ="";
        int counter=0;
        do {
            System.out.println("Lutfen 1-10 arasinda bir sayi giriniz");
            sayi= input.next().substring(0,1);//kullanici rakamin yanina bir karakter daha koyarsa onu ALMAMAK icin

            if(c.contains(sayi)){
                c.set(c.indexOf(sayi),"BINGO");
                counter++;

            }else if(!sayi.equals("Q")){
                c.add(sayi);
            }
            System.out.println(c);

        }while (!(counter == c.size()));
        System.out.println("KAZANDINIZ");
    }
}
