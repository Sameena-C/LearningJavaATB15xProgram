package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number a=");
        int a=scanner.nextInt();
        System.out.println("Enter a number b=");
        int b=scanner.nextInt();
        int sum=sum_two_numbers(a,b);
        System.out.println("Sum of the two numbers is: "+sum);
    }
    static int sum_two_numbers(int x, int y)
    {
        return x+y;
    }

    static void sum_two_numbers()
    {
        System.out.println("Hi there: Type 1");
    }


}
