package main.batch_129.day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public C01_Arrays() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();
        String[] names = new String[numOfStd];
        System.out.println("cikmak istiyorsaniz lutfen q harfine basiniz");

        for(int i = 1; i <= numOfStd; ++i) {
            System.out.println("Lutfen " + i + " ogrencinin ismini giriniz");
            String stdNames = input.next();
            if (stdNames.equalsIgnoreCase("q")) {
                break;
            }

            names[i - 1] = stdNames;
        }

        System.out.println(Arrays.toString(names));
    }
}
