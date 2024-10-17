//create a program that asks the user to enter a welcome message and then print the message to the console.
import java.lang.*;
import java.util.Scanner;
public class problemOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Welcome Message: ");
        String welcomeMessage = input.nextLine();
        System.out.println(welcomeMessage);
        input.close();
    }
}
