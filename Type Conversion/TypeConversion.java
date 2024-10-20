import java.lang.*;
public class TypeConversion{
    public static void main(String[] args) {
    float myFloat=6L;//literal small value takes float this is automatic type conversion which is called widening or implicit type conversion
    System.out.println(myFloat);
    //bit value takes small value
    int myInt=(int)6.56f;
    System.out.println(myInt);//explicit type conversion loss data output:6
    }
}