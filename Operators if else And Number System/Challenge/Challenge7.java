//create a program to convert temperature from Fahrenheit to Celsius

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        System.out.println("Convert temperature from Fahrenheit to Celsius!");
        System.out.print("Enter Fahrenheit Temperature: ");
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is: " + celsius);
        input.close();
    }
}
