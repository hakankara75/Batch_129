package main.batch_129.day37lambda;

public class Utilities {/*
herkesin kullanacagi metotlar bu class ta olacak. rojede calisan herkesin kullanacagi ve burada olmasina onay verdigi
metotlar bu class ta olacak.

*/

public static void yazInt(int a){
    System.out.print(a+" ");
}

    public static void yazIString(String b){
        System.out.print(b+" ");
    }

    public static boolean tekMi(int c){
    return c%2!=0;
    }

    public static boolean ciftMi(int d){
        return d%2==0;
    }

    public static boolean pozitifMi(int e){
    return e>0;
    }

    public static boolean negatifMi(int e){
        return e<0;
    }

    public static int kareBul(int f){
        return f*f;
    }

    public static int kupBul(int f){
        return f*f*f;
    }

    public static int toplam(int f, int a){
        return a+f;
    }

    public static int carpim(int b, int a){
        return a+b;
    }

    public static boolean uceBolunebilme(int n){
        return n%3==0;
    }
}
