//Create a program that add two numbers and print the result to the console.
import java.lang.*;
import java.util.Scanner;
public class problemTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
       input.close();
    }
}
