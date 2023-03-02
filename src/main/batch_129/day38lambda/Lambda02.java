package main.batch_129.day38lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {
    public Lambda02() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //LambdaTextFile dosyasi icindeki metni console a yazdiran kodu yazdiriniz.
        Files.//Lambda da dosyalar ile islem yapmak icin
                lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).// bu adrese git satirlara bak demek
                /* text dosyasi uzerinde sag klik copy path/reference seceriz.
        orda absolute path adresi bastan sona kadar verir.
        biz path from content root sectik. lines icine yapistirdik.
        */
forEach(System.out::println); //aldigin her bir elemani yazdir.

/*LambdaTextFile dosyasi icindeki her character i uppercase yapiniz.
 */
Files.
        lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).
        map(String::toUpperCase). //satirlari tek tek alacagi icin map kullandik
        forEach(Utils::printInTheSameLineWithSpace); //utils class i biz olusturup icine method lar koyduk

// LambdaTextFile icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz.
       boolean result= Files.
                lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).
                map(t->t.split(" ")). //herbir kelimeyi tek tek alacagimiz icin
                flatMap(Arrays::stream). //kelimeleri parcaladi stream icine koydu
                anyMatch(t->t.contains("java")); //herhangi birisi icin iceriyorsa true olur
        System.out.println(result); // true

// LambdaTextFile icinde her kelimenin "a" icerip icermedigini gosteren kodu yaziniz

        boolean result2= Files.
                lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).
                map(t->t.split(" ")). //herbir kelimeyi tek tek alacagimiz icin
                        flatMap(Arrays::stream).
                allMatch(t->t.contains("a")); //herbir kelime icin sonuc, iceriyorsa true olur
        System.out.println(result2); // true

        // LambdaTextFile icinde hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        boolean result3= Files.
                lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).
                map(t->t.split(" ")). //herbir kelimeyi tek tek alacagimiz icin
                        flatMap(Arrays::stream).
                noneMatch(t->t.contains("x")); //hicbir kelime icin sonuc, icermiyorsa true olur

        System.out.println(result3); // true

// // LambdaTextFile icinde  "r" ile biten kelimeleri sayan kodu yaziniz.
         long result4= Files.
                lines(Paths.get("src/main/batch_129/day38lambda/Lambdatextfile.txt")).
                map(t->t.split(" ")). //herbir kelimeyi tek tek alacagimiz icin
                        flatMap(Arrays::stream).
               filter(t->t.endsWith("r")).
         count(); //hicbir kelime icin sonuc, icermiyorsa true olur
        /*
        count yerine
        .collect(Collectors.toList()).size();
        yapilabilir. tavsiye edilmez.
         */

        System.out.println(result4); // 3

    }
}