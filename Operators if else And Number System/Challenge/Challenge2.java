//create a program that calculate product of two floating point numbers

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("Welcome to shopping complex!");
        System.out.println("Enter price of first item: ");
        Scanner input = new Scanner(System.in);
        float item1 = input.nextFloat();
        System.out.println("Enter price of second item: ");
        float item2 = input.nextFloat();
        System.out.println("Total price: " + (item1 + item2));
        input.close();
    }
}
