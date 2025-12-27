package ex_08_If_Condition;

import java.util.Scanner;

/*
✅ Triangle Classifier:

Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle.
 */
public class Task_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side1 value of a triangle");
        double s1=scanner.nextDouble();
        System.out.println("Enter the side2 value of a triangle");
        double s2=scanner.nextDouble();
        System.out.println("Enter the side3 value of a triangle");
        double s3=scanner.nextDouble();

        if( s1==s2 && s2==s3 )
        {
            System.out.println("Equilateral Triangle");
        }
        else if (s1==s2 || s2==s3 || s1==s3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }

    }
}
