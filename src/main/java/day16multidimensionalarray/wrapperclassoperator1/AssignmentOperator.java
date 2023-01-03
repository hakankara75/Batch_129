package day16multidimensionalarray.wrapperclassoperator1;

public class AssignmentOperator {
    public static void main(String[] args) {
int x=2;
int y=4;

x=x+4;
        System.out.println(x);//6
        x=x/2;
        System.out.println(x);//3
        x=x%y;
        System.out.println(x);//3
y=x;
        System.out.println(y);//3
        x=x-y;
        System.out.println(x-y);//3

    }
}
