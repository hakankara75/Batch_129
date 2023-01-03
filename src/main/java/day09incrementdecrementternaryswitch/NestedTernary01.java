package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
public static void main(String[] args) {
/* verilen yilin artik yil olup olmadigini kontrol edin. artik yil kurali(leap year):
1-yil 100e bolunuyorsa 400e de bolunmeli
2-yil 100e bolunuyorsa 4e de bolunmeli */
int year=1800;
String result= year%100==0? (year%400==0 ? "Leap Year": "Not Leap Year"): (year%4==0 ? "Leap Year": "Not Leap Year");
    System.out.println(result);


    }
}
