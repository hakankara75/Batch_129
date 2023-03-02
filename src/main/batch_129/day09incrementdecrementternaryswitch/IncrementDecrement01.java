package main.batch_129.day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {
//Increment
        int a = 5;
        System.out.println("a: " + a);
        a = a + 2;
        System.out.println("a: " + a);
        int b = 10;
        System.out.println("b: " + b);
        b = b + 5;
        System.out.println("b: " + b);
        b += 5;
        System.out.println("b: " + b);

        int d = 6;
        System.out.println("d: " + d);
        d = d * 2;
        System.out.println("d: " + d);
//Decrement
        int c = 8;
        System.out.println("c: " + c);
        d *= 2;
        System.out.println("d: " + d);
        c = c - 3;
        System.out.println("c: " + c);
        c -= 3;
        System.out.println("c: " + c);
        int e = 24;
        System.out.println("e: " + e);
        e = e / 2;
        System.out.println("e: " + e);
        e /= 2;
        System.out.println("e: " + e);
//1 ile increment ve decrement
        int f=12;
        f=f+1;
        f++;
        int h=10;
        h=h-1;
        h-=1;
        h--;
//post increment pre increment
        int i= 10;
        int k=i++;//post increment
        System.out.println("k: " +k);//k=10
        System.out.println("i: " +i);//i=11
        int m=15;
        int n= ++m;//pre increment
        System.out.println("m: " +m);//m=16
        System.out.println("n: " +n);//n=16
//post decrement ve pre decrement
        int p= 17;
        int r= p--;
        System.out.println("p: " +p);//k=16
        System.out.println("r: " +r);//i=17
        int s=20;
        int t=--s;
        System.out.println("s: " +s);//s=19
        System.out.println("t: " +t);//t=19
    }
}
