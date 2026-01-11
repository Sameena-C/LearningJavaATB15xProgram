package exam_11Jan2026;

import java.util.Scanner;

/*
5) Positive, Negative or Zero

Description:
Write a Java program to check whether a
given number is positive, negative, or zero using the ternary operator.
 */
public class JC05_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();

        String result= (num>0) ? "Positive" : (num<0 ? "Negative" : "Zero");

        System.out.println("Given number is: "+result);
    }
}
