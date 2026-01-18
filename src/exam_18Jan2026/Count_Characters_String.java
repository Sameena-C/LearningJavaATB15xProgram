package exam_18Jan2026;

import java.util.Scanner;
/*
1️⃣ Program Name: Count Characters in a String

Description:
Write a Java program to count the total number of characters in a given string (excluding spaces).
 */
public class Count_Characters_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=scanner.nextLine();
        String s2=s1.replaceAll(" ","");
        System.out.println("Number of Characters in the given String are: "+s2.length());
    }
}
