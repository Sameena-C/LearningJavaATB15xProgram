package exam_18Jan2026;

import java.util.Scanner;

/*
5️⃣ Program Name: Reverse a String

Description:
Write a Java program to reverse a given string using a loop.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=scanner.nextLine();
        String output="";

        for(int i=input.length()-1; i>=0; i--)
        {
            output=output+input.charAt(i);
        }
        System.out.println("Given String is: "+input);
        System.out.println("Reversed String is: "+output);
    }
}
