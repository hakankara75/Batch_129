package day14arraysForeachloops;

public class Arrays04 {
    public static void main(String[] args) {
/*Ex1. Strgin array olusturun. 6 eleman ekleyin. yellow dan onceki elemanlari yazdirin.
 */
        String colors[]= new String[6];
        colors [0]= "Red";
        colors [1]= "Orange";
        colors [2]= "Blue";
        colors [3]= "Yellow";
        colors [4]= "Green";
        colors [5]= "Brown";
    for (String w: colors){
        if (w.equals("Yellow")){
            break;
        }
        System.out.println(w);
    }

//Ex.2. string bir array olusturunuz. yellow dan sonraki elemanlari yazdirin.
        String color[]= new String[6];
        color [0]= "Red";
        color [1]= "Orange";
        color [2]= "Blue";
        color [3]= "Yellow";
        color [4]= "Green";
        color [5]= "Brown";
//tersten gelecegimiz icin for loop kullanilir. eac loop burada ise yaramaz.
//1.yol
        for (int i = color.length-1; i >=0 ; i--) {
if (color[i].equals("Yellow")){
    break;
}
            System.out.println(color[i]);//Green, Brown
        }
//2.yol
//yellow elemaninin indexini bul.bu indexten buyuk elemanlari yazdir.
        int counter=0;
        for (String w:colors ) {
        if(w.equals("Yellow")){
            break;
        }
            counter++;
        }

        for (int i = counter+1; i <color.length ; i++) {
            System.out.println(color[i]);//Green, Brown
        }





    }
 }
