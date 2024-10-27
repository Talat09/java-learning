import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Enter your score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 93) {
            System.out.println("Your Grade is: A");
        } else if (score >= 89) {
            System.out.println("Your Grade is: A-");
        } else if (score >= 85) {
            System.out.println("Your Grade is: B+");
        } else if (score >= 82) {
            System.out.println("Your Grade is: B");
        } else if (score >= 79) {
            System.out.println("Your Grade is: B-");
        } else if (score >= 75) {
            System.out.println("Your Grade is: C+");
        } else if (score >= 72) {
            System.out.println("Your Grade is: C");
        } else if (score >= 69) {
            System.out.println("Your Grade is: C-");
        } else if (score >= 65) {
            System.out.println("Your Grade is: D+");
        } else if (score >= 60) {
            System.out.println("Your Grade is: D");
        } else {
            System.out.println("Your Grade is: F");
        }
        input.close();
    }

}