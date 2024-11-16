//Write a program that determine the greatest of three numbers.

import java.util.Scanner;

public class GreatestThreeNumber {
    public static void main(String[] args) {
        System.out.println("Greatest of three numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        // check if a is greater than b and c
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        }
        // check if b is greater than a and c
        else if (b > a && b > c) {
            System.out.println(b + " is the greatest number");
        }
        // check if c is greater than a and b
        else {
            System.out.println(c + " is the greatest number");
        }
        input.close();
    }
}
