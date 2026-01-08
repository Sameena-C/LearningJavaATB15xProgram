package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive int number");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is: " + fact);
            scanner.close();
        } else {
            System.out.println("Please enter a valid positive int number");
        }
    }
}
/*
Edge Cases: 0!=1, 1!=1, and pramod as input, -1!=1 for negative number factorial will be 1
long number 998687653452312653L
 */