package exam_18Jan2026;

import java.util.Scanner;

/*
4️⃣ Program Name: Compare Two Strings

Description:
Write a Java program to compare two strings and check whether they are equal or not.
 */
public class Compare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1=scanner.nextLine();
        System.out.println("Enter the second String: ");
        String s2=scanner.nextLine();

       if(s1.equalsIgnoreCase(s2))
       {
           System.out.println("Both the Strings are equal");
       }
       else
       {
           System.out.println("Both the Strings are unequal");
       }

    }
}
