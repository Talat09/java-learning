import java.lang.*;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        a = b;// 20
        b = c;// 30
        c = a;// 20
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
