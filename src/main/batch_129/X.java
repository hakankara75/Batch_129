package main.batch_129;

import java.util.Arrays;

class X {
     public static void main(String[] args) {
         String [][]chs= new String[2][];
         chs[0]= new String[2];
         chs[1]= new String[5];
         int i=97;

         for (int a = 0; a < chs.length; a++) {
             for (int b = 0; b < chs.length; b++) {
                 chs[a][b]=""+i;
                 i++;
                 System.out.println(Arrays.deepToString(chs));
             }
         }
         for (String []ca:chs){
             for (String c:ca){
                 System.out.print(c+" ");
             }
             System.out.println();
         }
     }
 }


  
        
