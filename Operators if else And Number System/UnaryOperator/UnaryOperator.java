public class UnaryOperator {

    public static void main(String[] args) {
        // convert a positive value to a negative
        int x = 5;
        int y = -x; // x becomes negative
        int z = -y; // y becomes positive again
        System.out.println("Negative of x: " + y); // -5
        System.out.println("Back to positive: " + z); // 5

        // pre increment -> increment the value by 1 and then use it in our statement ++a
        int a = 5;
        a = a + 1;
        System.out.println("Initial value of a: " + a); // 6
        ++a; // a = a+1
        System.out.println("After pre-increment: " + a); // 7

        // pre decrement -> decrement the value by 1 and then use it in our statement --b
        int b = 5;
        b = b - 1;
        System.out.println("Initial value of b: " + b); // 4
        --b; // b = b-1
        System.out.println("After pre-decrement: " + b); // 3

        // post increment -> use current value in the statement and then increment it by 1 a++
        int c = 5;
        System.out.println("Initial value of c: " + c); // 5
        c++; // c = c+1
        System.out.println("After post-increment: " + c); // 6

        // post decrement -> use current value in the statement and then decrement it by 1 c--
        int d = 5;
        System.out.println("Initial value of d: " + d); // 5
        d--; // d = d-1
        System.out.println("After post-decrement: " + d); // 4

        // boolean negation example (flip boolean value using !)
        boolean flag = true;
        System.out.println("Initial boolean flag: " + flag); // true
        flag = !flag; // flip the boolean value
        System.out.println("After negation: " + flag); // false

        // Example with combined increment/decrement in an expression
        int e = 10;
        int result1 = ++e + 5; // Pre-increment: e is incremented to 11, then added to 5
        System.out.println("Pre-increment in expression (result1): " + result1); // 16
        System.out.println("Value of e after pre-increment: " + e); // 11

        int f = 10;
        int result2 = f++ + 5; // Post-increment: 10 is added to 5, then f becomes 11
        System.out.println("Post-increment in expression (result2): " + result2); // 15
        System.out.println("Value of f after post-increment: " + f); // 11

        // Another combined expression example
        int g = 20;
        int result3 = --g + 2; // Pre-decrement: g becomes 19, then added to 2
        System.out.println("Pre-decrement in expression (result3): " + result3); // 21
        System.out.println("Value of g after pre-decrement: " + g); // 19

        int h = 20;
        int result4 = h-- + 2; // Post-decrement: 20 is added to 2, then h becomes 19
        System.out.println("Post-decrement in expression (result4): " + result4); // 22
        System.out.println("Value of h after post-decrement: " + h); // 19

        // Chaining increments and decrements
        int i = 5;
        i++; // i = 6
        ++i; // i = 7
        i--; // i = 6
        --i; // i = 5
        System.out.println("After chaining operations, i: " + i); // 5
    }
}
