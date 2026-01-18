package exam_18Jan2026;

import java.util.Scanner;
/*
2️⃣ Program Name: Check String Length

Description:
Write a Java program to check whether the length of a given string
is greater than 10 or not and print the result.
 */
public class String_Length {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=scanner.nextLine();
        int len = s1.length();

        if(len>10)
        {
            System.out.println("Length of the given String is greater than 10");
        }
        else if (len<10)
        {
            System.out.println("Length of the given String is lesser than 10");
        }
        else
        {
            System.out.println("Length of the given String is equal to 10");
        }

        System.out.println("Length of the given String is: "+len);
    }
}
