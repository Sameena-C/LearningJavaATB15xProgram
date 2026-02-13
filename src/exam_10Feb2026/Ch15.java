package exam_10Feb2026;
/*
Custom Exception Implementation
Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.

Input: validateAge(15) and validateAge(25)
Output: InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25

Explanation:Custom exceptions extend Exception class and can carry specific error
information relevant to the application domain.
 */

import java.util.Scanner;

public class Ch15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        try{
            validateAge(age);
            System.out.println("Age is valid: " +age);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }

    }
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("InvalidAgeException: Age must be 18 or above. Provided age: "+ age);
        }
    }
}
