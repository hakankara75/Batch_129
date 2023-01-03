package day16multidimensionalarray.wrapperclassoperator1;

public class WrapperClass02 {
    public static void main(String[] args) {
//iki string data nin toplamini veren kodu yaziniz.
        String str="12345";
        String str1="23456";
        System.out.println(str1+str1);//12345623456 concanitation yapar. toplamaz.
        System.out.println(Integer.valueOf(str)+Integer.valueOf(str1));


    }
}
