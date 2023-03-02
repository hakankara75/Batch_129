package main.batch_129.projects.hastane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

import static main.batch_129.projects.hastane.DoktorIslemleri.doktorListesiMap;

public class D {
    public static void main(String[] args) {
        HashMap<String, String> doktorListesiMap = new HashMap<>();
        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "John, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");
        veriGirisi();
    }
 static    Integer menuSec=0;
   static boolean d=false;
    static Scanner scanner=new Scanner(System.in) ;



    public static void veriGirisi(){


            do {
                System.out.println("unvan giris yap");
                doktorListesiMap.put(scanner.nextLine(),scanner.nextLine());
                System.out.println(doktorListesiMap);

                BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("======== VERI GIRISINDESINIZ=========\n"+
                        "\t1-yazdirmaMenusu\n" +
                        "\t2-silmeMenusu\t\n" +
                        "\t3-veriGirisi");
                try {
                    menuSec = Integer.parseInt(brr.readLine());
                    d = true;
                }catch (NumberFormatException e){
                    System.out.println("Yanlis karakter girdiniz");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }while (!d);
            if (menuSec==1){
                yazdirmaMenusu();
            }
            if(menuSec==2){
                silmeMenusu();
            }else {
                veriGirisi();
            }
        }

public static void yazdirmaMenusu(){
    System.out.println(doktorListesiMap);
    BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("======== YAZDIRMA MENUSUNDESİNİZ=========\n"+
            "\t1-veriGirisi\n" +
            "\t2-yazdirmaMenusu \t\n" +
            "\t3-silmeMenusu");
    try {
        menuSec = Integer.parseInt(brr.readLine());
        d = true;
    }catch (NumberFormatException e){
        System.out.println("Yanlis karakter girdiniz");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

 while (!d);
            if (menuSec==1){
                veriGirisi();
    }
            if(menuSec==2){
                yazdirmaMenusu();
    }else {
                silmeMenusu();
    }
        }

        public static void silmeMenusu(){
            System.out.println("silmek istediginiz veriyi yazin");
            doktorListesiMap.remove(scanner.nextLine());
            System.out.println(doktorListesiMap);

            BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("======== ANA MENUSUNDESİNİZ=========\n"+
                    "\t1-veriGirisi\n" +
                    "\t2-yazdirmaMenusu \t\n" +
                    "\t3-silmeMenusu");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            }catch (NumberFormatException e){
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            while (!d);
            if (menuSec==1){
                veriGirisi();
            }
            if(menuSec==2){
                yazdirmaMenusu();
            }else {
                silmeMenusu();
            }
        }

}