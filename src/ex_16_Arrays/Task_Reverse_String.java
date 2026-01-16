package ex_16_Arrays;

import java.util.Scanner;

public class Task_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=scanner.nextLine();
        String output="";

        for(int i=input.length()-1; i>=0; i--)
        {
            output=output+input.charAt(i);
        }
        System.out.println("Given String: "+input);
        System.out.println("Reversed String "+output);


    }
}
