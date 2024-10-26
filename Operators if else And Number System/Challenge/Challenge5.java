//create a program to calculate simple interest

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        System.out.println("Calculate simple interest!");
        System.out.print("Enter principal: ");
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter time: ");
        int time = input.nextInt();
        double simpleInterest = principal * interestRate * time;
        System.out.println("Simple interest is: " + simpleInterest);
        input.close();
    }
}
