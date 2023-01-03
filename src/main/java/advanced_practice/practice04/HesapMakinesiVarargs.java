package advanced_practice.practice04;

public class HesapMakinesiVarargs {
    public static void main(String[] args) {
HesapMakinesi islem= new HesapMakinesi();//bu klas icinde HesapMakinesi icindeki metotlari kullanmak icin yaptik
islem.toplama(3,5,7,96,58,87);
islem.cikarma(5,8,6,1,687,88);
islem.cikarma(545,45,2);
islem.bolme(458,2);
        System.out.println(islem);
    }
}
