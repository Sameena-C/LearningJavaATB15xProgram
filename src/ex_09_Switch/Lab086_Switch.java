package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day num 1 to 7");

        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
/*
what will be the output if day value entered is 3
nothing will be on the output
because there is no matching case so no output
 */