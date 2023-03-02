package main.batch_129.day16multidimensionalarrays.wrapperclassoperator1.day16multidimensionalarray;

public class AssignmentOperator {
    public AssignmentOperator() {
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        x += 4;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= y;
        System.out.println(x);
        y = x;
        System.out.println(x);
        x -= x;
        System.out.println(x - y);
    }
}
