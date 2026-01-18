package exam_18Jan2026;

import java.util.Scanner;

/*
3️⃣ Program Name: Convert String to Uppercase

Description:
Write a Java program to convert a given string into uppercase and print the result.
 */
public class Uppercase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=scanner.nextLine();

        String s2=s1.toUpperCase();
        System.out.println("The given String in Uppercase: "+s2);


    }
}
