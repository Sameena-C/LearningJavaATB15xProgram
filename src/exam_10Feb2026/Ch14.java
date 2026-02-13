package exam_10Feb2026;
/*
Multi-Exception Handling
Implement exception handling for a program that divides two numbers
and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.

Input: Division by zero, invalid number format, array index out of bounds
Output: ArithmeticException: Cannot divide by zero NumberFormatException: Invalid number format
ArrayIndexOutOfBoundsException: Array index out of bounds

Explanation:Multiple catch blocks can handle different types of exceptions that might occur in a try block.
 */

public class Ch14 {
    public static void main(String[] args) {
        try{
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 10/a;
            System.out.println(b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException: Invalid number format");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
