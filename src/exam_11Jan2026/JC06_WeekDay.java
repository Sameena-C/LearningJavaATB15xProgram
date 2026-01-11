package exam_11Jan2026;

import java.util.Scanner;

/*
6) Day of the Week

Description:
Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
 */
public class JC06_WeekDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 to print the name of the day");

        int day=scanner.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid int value between 1 to 7 and Try again!!");
                break;
        }
    }
}
