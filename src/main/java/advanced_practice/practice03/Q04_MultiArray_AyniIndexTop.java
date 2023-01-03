package advanced_practice.practice03;

import java.util.Arrays;

public class Q04_MultiArray_AyniIndexTop {
    public static void main(String[] args) {
/*      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.        */
       int[][] arr1 ={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};
        int limit;

        for (int i = 0; i < arr1.length ; i++) {
            limit= arr1[i].length;
            if (limit> arr2[i].length){//karsiligi olmayan eleman oldugu icin kucuk indexliyi almak istiyorum
                limit= arr2.length;
            }

            for (int j = 0; j <limit ; j++) {
              int  toplam= arr1[i][j]+ arr2[i][j];
                System.out.print("arr1["+i+"]["+j+"]+ arr2["+i+"]["+j+"]= "+toplam);
            }
        }



    }
}
