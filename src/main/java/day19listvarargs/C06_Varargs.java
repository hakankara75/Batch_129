package day19listvarargs;

public class C06_Varargs {
    public static void main(String[] args) {

//iki sayiyi toplayan bir metot olusturacagiz
        ikiSayiyiTopla(2,3);
        ucSayiyiTopla(6,8,14);
        dortSayiyiTopla(56,96,40,30);




    }

    private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {
        return i+i1+i2+i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
        return i+i+i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {
   return i+i1;

    }
    private static int add(int ...a){//... sonsuza kadar veri ekleyebilirsin demek. istedigin kadar sayiyi toplar.
        int sum=0;
        for (int w:a){
        sum=sum+w;

        }
        return sum;
    }
}
