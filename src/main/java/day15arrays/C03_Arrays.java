package day15arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
//[0, 2, 3, 0, 12, 0] array indeki 0 lari en sona atan kodu yaziniz.
        int original []={0, 2, 3, 0, 12, 0};
        int yeni[]= new int[original.length];//[0, 0, 0, 0, 0, 0]
        int idx=0;
        for (int i = 0; i < original.length; i++) {//original arrray dan tek tek rakamları okuyacak
            if (original[i]!=0){
                yeni[idx]=original[i];
                idx++;//bir sonraki indexe gecer
            }
        }
        System.out.println(Arrays.toString(yeni));





    }
}
