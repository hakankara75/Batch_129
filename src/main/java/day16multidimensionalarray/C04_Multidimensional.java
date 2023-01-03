package day16multidimensionalarray;

public class C04_Multidimensional {
    public static void main(String[] args) {
//multidimensional array deki en buyuk ve kucuk elemanin toplamini veren kodu yaziniz
int arr[][] = {{2, 5, 1}, {83, 75}};
 int maxElement = arr[0][0];
int minElement = arr[0][0];
 for (int[] w : arr) {//multidimensional array, array e cevrildi
   for (int k : w) {//array integer a cevrildi.
     maxElement = Math.max(maxElement, k);
      minElement = Math.min(minElement, k);
}//inner loop
}//outor loop
System.out.println(minElement);
System.out.println(maxElement);
System.out.println(maxElement + minElement);




    }
}
