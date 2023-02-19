package main.batch_129.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoktorIslemleri {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> doktorListesiMap = new HashMap<>();

    public static void doktorListesi(){
        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "Johm, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");
    }

    public static void doktorMenu() throws InterruptedException {
        int tercih = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("============DOKTOR MENUSU===========\n" +

                "\n" +
                "\t  1-Doktor Ekle\t\n" +
                "\t  2-Doktor Listesi Yazdir\n" +
                "\t  3-Unvandan Doktor Bulma\n" +
                "\t  4-Doktor Silme\n" +
                "\t  5-ANAMENU\n" +
                "\t  6-CIKIS");

        tercih = scan.nextInt();
        switch (tercih) {
            case 1:
                doktorEkleMethodu();
                doktorMenu();
                break;

            case 2:
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case 3:
                unvandanDoktorBulma();
                doktorMenu();
                break;
            case 4:
                doktorSilme();
                doktorMenu();
                break;
            case 5:
                hastaneMenusu();
                break;
            case 6:
                doktorMenusu();
                break;

            default:
                System.out.println("Lutfen gecerli tercih yapiniz");

        }
    }


    public static void doktorEkleMethodu(){
        System.out.println("=========DOKTOR EKLEME========");
        System.out.println("Doktor ismi giriniz: ");
        String doktorAdi = scan.nextLine();
        System.out.println("Doktor soyismini giriniz: ");
        String doktorSoyIsim = scan.nextLine();
        System.out.println("Doktor unvanini giriniz: ");
        String doktorUnvan = scan.nextLine();
        String doktorTamAd = doktorAdi + " , " + doktorSoyIsim;
        doktorListesiMap.put(doktorUnvan,doktorTamAd);
    }

    public static void doktorListesiYazdirma(){}

    public static void unvandanDoktorBulma(){
        System.out.println("Aradiginiz doktorun unvanini giriniz");
        String arananUnvan=scan.nextLine();

    }

    public static void doktorSilme(){
        System.out.println("Silmek istediginiz doktorun unvanin giriniz");
        String arananUnvan=scan.nextLine();

        boolean flag=false;
        if (doktorListesiMap.containsKey(arananUnvan)){
            doktorListesiMap.remove(arananUnvan);
            System.out.println("Istenen doktor silindi");
            System.out.println("========Guncel doktor listesi=======");
            doktorListesiYazdirma();
            flag=true;

        }
        if (flag=false){
            System.out.println("Gecerli unvan giriniz");
            unvandanDoktorBulma();
        }
    }

    public static void hastaneMenusu(){}

    public static void doktorMenusu(){}



}//class
