
//create a program that determines if a given year is a leap year or not (considering that a leaf year is divisible by 4, but not  100, unless it is also divisible by 400)
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Check if a year is a leaf year");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        input.close();
    }
}
