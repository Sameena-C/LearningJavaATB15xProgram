package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2D_Right_Aligned_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n for the pattern");
        int n=scanner.nextInt();
        for (int i=0; i < n ; i++)
        {
            for (int space=0; space< n-i-1; space++)
            {
                System.out.print(" ");
            }
            for (int star=0; star<=i; star++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
