package ex_15_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab150_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=scanner.nextLine();
        String output="";
        for (int i=input.length()-1; i>=0; i--)
        {
            output=output+input.charAt(i);
        }
        if(input.equalsIgnoreCase(output))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
