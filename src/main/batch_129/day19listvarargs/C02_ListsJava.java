package main.batch_129.day19listvarargs;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ListsJava {
    public C02_ListsJava() {
    }

    public static void main(String[] args) {
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kullanici adini giriniz");
        String username = input.nextLine().toUpperCase().trim();
        if (databaseIsim.contains(username)) {
            System.out.println("Bu kullanici adi zaten alinmis.");
        } else {
            System.out.println("Bu kullanici adini kullanabilirsiniz.");
        }


        if (databaseIsim.contains(username)){
            int rastgeleSayi=new Random().nextInt(10);//aralik belirlememiz lazim. bunu metot () icine gireririz
            username=username+""+rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz: ");
        }else {
            System.out.println("Yeni kullanici adi olarak sectiginizi kullanabilirsiniz: "+username);
        }
    }
}