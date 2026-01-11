package exam_11Jan2026;

import java.util.Scanner;

/*
2) Even or Odd Number

Description:
Write a Java program to check whether a given number is even or odd using arithmetic operators.
 */
public class JC02_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd:");
        int num=scanner.nextInt();
        if(num%2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
