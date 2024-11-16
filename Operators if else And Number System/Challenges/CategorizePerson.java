//Create a program that Cateegorizes a person into different age groups based on the following criteria:
// Child: bellow 13
// Teenager: bellow 20
// Adult: bellow 60
// Senior: above 60

import java.util.Scanner;

public class CategorizePerson {
    public static void main(String[] args) {
        System.out.println("Categories of person");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 20) {
            System.out.println("Teenager");
        } else if (age >= 20 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
        input.close();
    }
}
