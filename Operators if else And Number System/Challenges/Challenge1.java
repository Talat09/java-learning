// create a program that determines if a number if a number is positive ,negative or zero

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("Welcome to the number checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is zero");
        }
        input.close();
    }
}