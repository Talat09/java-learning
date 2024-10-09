import java.lang.*;
public class variableAndDataTypes {
  public static void main(String[] args) {
    // Create variables of different data types
    //create a byte variable
    byte age = 100;
    //create a short variable
    short population = 10000;
   
    // Create an integer variable
    int items = 50;
     //create a long variable
     long populationOfWorld = 7800000000L;

    // Create a float variable
    float costPerItem = 9.99f;
    // Calculate total cost
    float totalCost = items * costPerItem;
    // Create a character variable
    char currency = '$';
    // Create a boolean variable
    boolean isAvailable = true;
    // Create a string variable
    String customerName = "John Doe";
    // Print variables
    System.out.println("Customer Name: " + customerName);
    System.out.println("Product Available: " + isAvailable);
    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost = " + totalCost + currency);
  }
}