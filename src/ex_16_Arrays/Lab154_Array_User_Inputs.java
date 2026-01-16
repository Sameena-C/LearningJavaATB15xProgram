package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int[] number_marks = new int[size];
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the marks");
            number_marks[i] = scanner.nextInt();
        }

        System.out.println("=======================");

        for (int i = 0; i < number_marks.length; i++)
        {
            System.out.println(number_marks[i]);
        }
        System.out.println("=======================");

        for(int a: number_marks){
            System.out.println(a);
        }
    }

}
