package main.batch_129.day10switchloops;
public class Loops02 {
    public static void main(String[] args) {
//Ex. 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdirna kodu yaziniz.
        for (int i = 21; i < 181; i++) {
            if (i%4==0 && i%6==0){
                System.out.print(i+ " ");
            }
        }
//Ex. size kucuk harfle verilen stringin indexi cift sayi olan character lerini buyuk harf yapiniz.
//yazilan kod bazi senaryolar icin calisiyor, tum senaryolar icin calismiyorsa bu code a hard-code denir.
//hard-code yanlis yazilmis koddur ve duzeltilmesi gerekir.
//bir string de son index=length()-1 dir.
        String s= "ankara";
        for (int i = 0; i < s.length(); i++) {//ilk karakter indx degeri 0 oldugundan baslangic degeri 0 olur.
            String ch=s.substring(i, i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }
    }
}
