import java.lang.*;
//Widening casting is done automatically when passing a smaller size type to a larger size type:
public class wideningCasting {
    public static void main(String[] args) {
      int myInt = 9;
      double myDouble = myInt; // Automatic casting: int to double
  
      System.out.println("Output is: " + myInt);      // Outputs 9
      System.out.println("Output is: " +myDouble);   // Outputs 9.0
    }
  }