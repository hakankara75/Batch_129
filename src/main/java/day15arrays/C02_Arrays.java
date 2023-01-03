package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
/* bir string de sesli harflerin sayisini bulan kodu yaziniz*/
        String str = "java ogrenince para kazanmak,ne kolay,ogrenmeyeyince nekadar zor";
        str =str.toLowerCase();//kucuk buyuk ugrasmamak icin
        String harfler[]  = str.split("");//harf harf ayirmak
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a
        // ,  , k, a, z, a, n, m, a, k, ,, n, e,  , k, o, l, a, y, ,, o, g, r, e, n, m, e, y, e, y, i, n, c, e,  , n, e, k, a, d, a, r,  , z, o, r]
        int counter =0;
        for (String w:harfler){
            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;
            }
        }
        System.out.println(counter);









    }
}
