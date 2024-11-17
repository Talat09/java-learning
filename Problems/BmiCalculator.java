import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight in kilograms
        System.out.print("Enter your weight in kilograms (kg): ");
        double weightInKg = scanner.nextDouble();

        // Prompt user for height in feet and inches
        System.out.print("Enter your height (feet part): ");
        int heightFeet = scanner.nextInt();
        System.out.print("Enter your height (inches part): ");
        int heightInches = scanner.nextInt();

        // Convert height to total inches, then to meters
        int totalInches = (heightFeet * 12) + heightInches; // Convert feet to inches
        double heightInMeters = totalInches * 0.0254; // Convert inches to meters

        // Validate input
        if (weightInKg <= 0 || totalInches <= 0) {
            System.out.println("Invalid input! Weight and height must be positive numbers.");
        } else {
            // Calculate BMI
            double bmi = weightInKg / (heightInMeters * heightInMeters);

            // Determine BMI category
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24.9) {
                category = "Normal weight";
            } else if (bmi < 29.9) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }

            // Display results
            System.out.printf("Your height in meters is: %.2f m%n", heightInMeters);
            System.out.printf("Your weight in kilograms is: %.2f kg%n", weightInKg);
            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("You are in the " + category + " category.");
        }

        scanner.close();
    }
}
