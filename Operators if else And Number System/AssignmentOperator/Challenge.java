import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        // create two number swap the number without using temp variable

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping station: ");
        System.out.print("Enter Value of a: ");
        int a = input.nextInt();
        System.out.print("Enter Value of b: ");
        int b = input.nextInt();
        // Swap using arithmetic operations
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)
        System.out.println("After swapping: a = " + a + ", b = " + b);
        input.close();

    }
}
