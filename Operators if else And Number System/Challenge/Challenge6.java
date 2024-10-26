//create a program that calculate compound interest

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        System.out.println("Calculate compound interest!");
        System.out.print("Enter principal: ");
        Scanner input = new Scanner(System.in);
        int principal=input.nextInt();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter time: ");
        int time = input.nextInt();
        double compoundInterest = principal * (1+interestRate/100)*time;
        System.out.println("Compound interest is: " + compoundInterest);
        input.close();
    }
}
