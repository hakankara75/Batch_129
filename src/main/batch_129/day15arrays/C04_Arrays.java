package main.batch_129.day15arrays;

public class C04_Arrays {
    public C04_Arrays() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 5, -3};
        int eleman = 5;
        int sayac = 0;
        int[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int w = var4[var6];
            if (w == eleman) {
                ++sayac;
            }
        }

        if (sayac > 0) {
            System.out.println("" + eleman + " Array de " + sayac + " defa var.");
        } else {
            System.out.println("" + eleman + " Array de yok.");
        }

    }
}
