package main.batch_129.day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_List {
    public C03_List() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> c = new ArrayList();
        c.add("5");
        c.add("8");
        c.add("2");
        c.add("9");
        System.out.println("c = " + c);
        String sayi = "";
        int counter = 0;

        do {
            System.out.println("Lutfen 1-10 arasinda bir sayi giriniz");
            sayi = input.next().substring(0, 1);
            if (c.contains(sayi)) {
                c.set(c.indexOf(sayi), "BINGO");
                ++counter;
            } else if (!sayi.equals("Q")) {
                c.add(sayi);
            }

            System.out.println(c);
        } while(counter != c.size());

        System.out.println("KAZANDINIZ");
    }
}
