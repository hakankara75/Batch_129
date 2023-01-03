package advanced_practice.practice04;

public class ForLoop {
    public static void main(String[] args) {
        // Baslangic ve bitis sayilari arasindaki artis miktarinca artirilarak
// verilen tum sayilari aralarina virgul koyarak yazdirin
// int baslangic=10;
// int bitis=50;
// int artisMiktari=5;
int baslangic=10;
int bitis=50;
int artisMiktari=5;
        for (int i = baslangic; i < bitis; i+=artisMiktari) {
           if (i<bitis){
            System.out.println(i+ "");
        }else {
               System.out.println(i);
           }


        }
    }
}
