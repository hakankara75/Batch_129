package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {
//Ex. 1 den 100 kadar 6 ile bolunenler haric tüm tamsayilari ekrana yazdirin.
        for (int i = 1; i < 101; i++) {
            if (i % 6 != 0) {

            }
            System.out.print(i + " ");
        }
        System.out.println();
//        2.yol
        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        } System.out.println();
//size verilen bir string i terse ceviren kodu yaziniz
        String str = "Mustafa"; //"afatsuM"
        String ters = "";
        for (int i = str.length() - 1; i >-1; i--) {
            char harf = str.charAt(i);
            ters += harf; //ters=ters+harf;
        }
        System.out.print(ters);
    }
}