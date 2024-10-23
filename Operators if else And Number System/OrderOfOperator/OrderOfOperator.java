import java.lang.*;

public class OrderOfOperator {
    public static void main(String args[]) {
        System.out.println(10 + 20 + 30 + 40 + 50);
        int result = 10 + 20 * 3; // Multiplication is evaluated before addition
        System.out.println("Result: " + result); // Output: 70

        result = (10 + 20) * 3; // Parentheses change the order of evaluation
        System.out.println("Result with parentheses: " + result); // Output: 90

        boolean comparison = 10 + 2 > 5 * 2; // Multiplication is evaluated first, then addition, then comparison
        System.out.println("Comparison result: " + comparison); // Output: true

        int a = 5;
        int b = 10;
        int c = 15;
        boolean logical = a < b && b < c; // Relational operators are evaluated before logical AND
        System.out.println("Logical result: " + logical); // Output: true
    }
}