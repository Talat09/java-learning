import java.lang.*;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a new Scanner object
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.println("Your Name is: "+name);
        System.out.print(name+"Enter your age:");
        int age = input.nextInt();
        System.out.println(name+" Your age is:"+age);
        input.close();// Close the Scanner to prevent resource leaks
    }
}