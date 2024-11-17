
//Create a program that determines if a given number is odd or even.
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Check if a number is odd or even");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        input.close();
    }
}
