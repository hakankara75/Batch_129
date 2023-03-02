package main.batch_129.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
                Java'da method nasil olusturulur?
​
                1)main method'un disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}
​
                Olusturulan method'lar nasil kullanilir?
                1)main method'un icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
         */
static public int add(int a, int b){

    int add= a+b;
    return add;
    }
    public static void main(String[] args) {

        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);

        System.out.println(kup);
    }

    private static double getCube(int i) {
        double getCube=i*i*i;
        return getCube;
    }

    private static int firstTwoMultiplyThirdAdd(int i, int i1, int i2) {
        int firstTwoMultiplyThirdAdd= (i+i1)*i2;
        return firstTwoMultiplyThirdAdd;
    }

    private static long multiply(int i, int i1) {
    long multiply= i*i1;
    return multiply;
    }

}