package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {
public static void main(String[] args) {
/* asagidaki sekli cizen kodu yaziniz
1
12
123
1234
12345
123456
* */
    for (int i = 1; i < 6; i++) {//satir kontrolu

        for (int j = 1; j <= i; j++) {//sutun veya rakam kontrolu
            System.out.print(j + " ");
        }
        System.out.println();//alt satira gecmek, arada bosluk yapmak icin
    }
    System.out.println();
/*asagidaki sekli cizen kodu yaziniz
* * * *
* * *
* *
*

 */
int satir=4;
    for (int i = 1; i <=satir; i++) {//satir kontrolu
        for (int j =satir; j >=i ; j--) {//yildiz kontrolu
            System.out.print(" *");
        }
                System.out.println();
    }

/*
     *
    *  *
   *    *
 *        *
* * * * * * *

satır sayısını kulllanicidan alarak yukaridaki şekli çizen kodu yazınız

 */
//once kac satir var. ona bak.
//sonra bosluklari kontrol et.
    Scanner input= new Scanner(System.in);
    System.out.println("Lutfen satir sayisini girin");
    int row= input.nextInt();

    for (int i = 0; i <=row ; i++) {//satir
        for (int bosluk =row; bosluk >=i ; bosluk--) {//sutun kontrolu, bosluk kac tane olacak?
//1. satir 4 bosluk 1 yildiz
            System.out.println(" ");//ucgenin icine bosluk atmak icin
        }
        for (int yildiz = 1; yildiz <=i ; yildiz++) {//yildiz artarak gidiyor.
//ilk satirda 1 yildiz. 2 de 2. 3. satirda 3....
if (yildiz==1 ||yildiz==i){
    System.out.print("* ");//enn distaki yildizlar
} else if (i==row) {
    System.out.print("* ");//en alttaki yildizlar
    }else
    System.out.print("  ");//3 ve 4. satirin ucgen ici bosluklari
        }
        System.out.println();//loop dongusunda bir alt satira inmek icin. her donus bittiginde bir alt satira gecirir.
    }


   }
}











