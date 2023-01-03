package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
 /*Kullaniciya ülke ismini sor. verdigi ismin ulke kisaltmasina ceviren kodu yaziniz. */
        Scanner input = new Scanner(System.in);
        System.out.println("ulke adini giriniz");
        String countryName= input.nextLine();//toLoweCase burada da kullanilabilir.
        switch (countryName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
                case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albenia":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("bu ulke tanimli degil");

        }

    }
}
