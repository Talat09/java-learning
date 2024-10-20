import java.util.Scanner;

public class ChallengeSwap {
    public static void main(String[] args) {
        // create two number swap the number using temp variable
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping station: ");
        System.out.print("Enter Value of a: ");
        int a = input.nextInt();
        System.out.print("Enter Value of b: ");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        input.close();
    }
}
