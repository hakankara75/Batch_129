package main.batch_129.day11loops;

public class C06_NestedLoop {
    public static void main(String[] args) {
/* asagida gorunen ciktiyi verecek kodu yaziniz.
Week: 1
    Day: 1
    Day: 2
    Day: 3
    ....
Week: 1
    Day: 1
    Day: 2
    Day: 3
    .....
Week: 1
    Day: 1
    Day: 2
    Day: 3
 */
        for (int i = 1; i < 4; i++) {

            System.out.println("Week: " + i);}
//buraya curly braces koyarsak i dongusunu 3 defa yapiyor. ondan sonra asagi geciyor.
        for (int j = 1; j < 4; j++) {

            System.out.println("Day: " + j);

        }
        System.out.println(".............");




    }
}