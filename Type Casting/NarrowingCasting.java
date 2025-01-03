import java.lang.*;
//Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
public class NarrowingCasting {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println("Output is: " +myDouble);   // Outputs 9.78
        System.out.println("Output is: " +myInt);      // Outputs 9
      }
}
