package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 den 10 kadar bir sayiyi giriniz");
        int firstNum = input.nextInt();
        int a = firstNum < 0 ? firstNum * -1 : firstNum;
        int counter = 1;
        for (int i = 1; i < a; i++) {
            counter = counter * i;
        }
        System.out.println(counter);

    }

}










