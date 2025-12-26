package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Multi_User_Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1=scanner.nextInt();

        System.out.println("Enter the side2");
        int side2=scanner.nextInt();

        System.out.println("Enter the side3");
        int side3=scanner.nextInt();

        System.out.println(side1+side2+side3);


    }
}
