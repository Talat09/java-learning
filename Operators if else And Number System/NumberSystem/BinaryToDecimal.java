package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number as a string
        System.out.print("Enter a binary number (e.g., 11010.11): ");
        String binaryString = scanner.nextLine();

        // Split into integer and fractional parts
        String[] parts = binaryString.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        double decimalValue = 0;

        // Convert the integer part
        int integerDecimal = Integer.parseInt(integerPart, 2);
        decimalValue += integerDecimal;

        // Convert the fractional part
        for (int i = 0; i < fractionalPart.length(); i++) {
            char bit = fractionalPart.charAt(i);
            if (bit == '1') {
                decimalValue += Math.pow(2, -(i + 1));
            }
        }

        // Output the result
        System.out.println("Decimal equivalent: " + decimalValue);

        scanner.close();
    }
}
// 0=0000
// 1=0001
// 2=0010
// 3=0011
// 4=0100
// 5=0101
// 6=0110
// 7=0111
// 8=1000
// 9=1001
// 10=1010
// 11=1011
// 12=1100
// 13=1101
// 14=1110
// 15=1111
// 16=10000
// 17=10001