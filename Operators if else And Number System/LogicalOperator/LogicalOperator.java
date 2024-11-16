import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // Ticket discount
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");

        System.out.print("Enter your Name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        System.out.print("Are you male? (true/false): ");
        boolean isMale = input.nextBoolean();

        System.out.print("Are you a veteran? (true/false): ");
        boolean isVeteran = input.nextBoolean();

        System.out.print("Is it a holiday? (true/false): ");
        boolean isHoliday = input.nextBoolean();

        // Determine discount based on input conditions
        if (age < 5) {
            System.out.println(name + ", you are a child and you get a free ticket.");
        } else if (age >= 5 && age < 18 && isFemale) {
            System.out.println(name + ", you are a teenage female and you get a 50% discount.");
        } else if (age >= 5 && age < 18 && isMale) {
            System.out.println(name + ", you are a teenage male and you get a 25% discount.");
        } else if (age >= 18 && age < 65) {
            if (isVeteran) {
                System.out.println(name + ", you are an adult veteran and you get a 30% discount.");
            } else {
                System.out.println(name + ", you are an adult and you get a 10% discount.");
            }
        } else if (age >= 65) {
            System.out.println(name + ", you are a senior and you get a 20% discount.");
        } else {
            System.out.println("Invalid input.");
        }

        // Additional discount for holidays
        if (isHoliday) {
            System.out.println("Special Holiday Promotion! Everyone gets an extra 10% discount!");
        }

        // Validate gender input
        if (!isFemale && !isMale) {
            System.out.println("Invalid gender input. Please check your response.");
        }

        input.close();
    }
}
