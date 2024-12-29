package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number (e.g., 11.11): ");
            double decimalNumber = scanner.nextDouble();

            int integerPart = (int) decimalNumber;
            double fractionalPart = decimalNumber - integerPart;

            // Convert the integer part to binary
            String binaryIntegerPart = Integer.toBinaryString(integerPart);

            System.out.println("Binary representation of integer part: " + binaryIntegerPart);

            // Convert the fractional part to binary
            StringBuilder binaryFractionalPart = new StringBuilder();
            int precision = 5; // Adjust the precision as needed
            while (fractionalPart > 0 && precision-- > 0) {
                fractionalPart *= 2;
                if (fractionalPart >= 1) {
                    binaryFractionalPart.append("1");
                    fractionalPart -= 1;
                } else {
                    binaryFractionalPart.append("0");
                }
            }

            System.out.println("Binary representation of fractional part: " + binaryFractionalPart);

            // Combine both parts
            String binaryRepresentation = binaryIntegerPart + "." + binaryFractionalPart.toString();
            System.out.println("Binary representation of " + decimalNumber + " is: " + binaryRepresentation);
        } finally {
            scanner.close(); // Close the scanner to avoid resource leaks
        }
    }
}
