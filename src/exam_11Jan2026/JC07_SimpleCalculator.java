package exam_11Jan2026;

import java.util.Scanner;

/*
7) Simple Calculator

Description:
Write a Java program to perform
addition, subtraction, multiplication, or division based on user choice using a switch statement.
 */
public class JC07_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        double a=scanner.nextDouble();
        System.out.println("Enter second number:");
        double b=scanner.nextDouble();

        System.out.println("Enter the choice 1 Addition, 2 Subtraction, 3 Multiplication, or 4 Division");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                double add=a+b;
                System.out.println("Addition of numbers: "+add);
                break;

            case 2:
                double sub=a-b;
                System.out.println("Subtraction of numbers: "+sub);
                break;

            case 3:
                double mul=a*b;
                System.out.println("Multiplication of numbers: "+mul);
                break;

            case 4:
                double div=a/b;
                System.out.println("Division of numbers: "+div);
                break;

            default:
                System.out.println("Please enter a valid choice value and Try again!!");
                break;

        }

    }
}
