package exam_11Jan2026;
/*
1) Arithmetic Operations on Two Numbers

Description:
Write a Java program that takes two integer numbers
and prints their sum, difference, multiplication, division, and remainder.
 */
import java.util.Scanner;

public class JC01_Arith_Operations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first integer number:");
        int a=scanner.nextInt();
        System.out.println("Enter second integer number:");
        int b=scanner.nextInt();

        int sum=a+b;
        int difference=a-b;
        int multiplication=a*b;
        int division=a/b;
        int remainder=a%b;

        System.out.println("Sum of two integer numbers: "+sum);
        System.out.println("Difference of two integer numbers: "+difference);
        System.out.println("Multiplication of two integer numbers: "+multiplication);
        System.out.println("Division of two integer numbers: "+division);
        System.out.println("Remainder of two integer numbers: "+remainder);


    }
}
