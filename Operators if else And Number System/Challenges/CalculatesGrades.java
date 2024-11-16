
//create a program that calculates grades based on the following criteria:
// A: above 90%
// B: above 75%
// C: above 60%
// D: above 30%
// F: below 30%
import java.util.Scanner;

public class CalculatesGrades {
    public static void main(String[] args) {
        System.out.println("Calculate grades");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if (number > 90) {
            System.out.println("A");
        } else if (number > 75) {
            System.out.println("B");
        } else if (number > 60) {
            System.out.println("C");
        } else if (number > 30) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        input.close();
    }
}
