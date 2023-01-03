package day16multidimensionalarray;

public class C03_MultidimensionalArrays {
    public static void main(String[] args) {
/* Asagidaki multi dimensional array'in  tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
{ {1,2,3}, {4,5,6} } */
//Metot kullanarak çözüm
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        carpimYazdir(arr);
    }
    private static void carpimYazdir(int[][] arr) {
        int carpim=1;//carparken degeri degistirmemesi icin 1 koydum
        for (int i = 0; i < arr.length; i++) { //arr nin uzunlugu: 6
            for (int j = 0; j < arr[i].length; j++){//i kattaki arr nin uzunlugu. ilk kat:3, ikinci kat:3
                carpim*=arr[i][j]; //carpim=carpim*aarr[i][j];
            }
        } System.out.println(carpim);





    }
}
