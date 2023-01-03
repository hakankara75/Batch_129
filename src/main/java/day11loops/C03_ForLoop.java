package day11loops;
public class C03_ForLoop {
    public static void main(String[] args) {
//Interwiew quwstions
//string karakterleri tek tek yazdiran
//eger "a" karakterini gorurse yazdirmayi durduran kodu yaziniz

String cumle="Ogrenmek yasamin tek kanitidir";
        for (int i = 0; i <cumle.length()-1 ; i++) {
if (cumle.charAt(i)== 'a'){
    break;
}
            System.out.print(cumle.charAt(i)+" ");
        }












    }
}
