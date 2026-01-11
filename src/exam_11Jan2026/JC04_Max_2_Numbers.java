package exam_11Jan2026;
/*
4) Maximum of Two Numbers

Description:
Write a Java program to find the maximum of two numbers using the ternary operator.
 */
public class JC04_Max_2_Numbers {
    public static void main(String[] args) {
        int a=20;
        int b=100;

        int max=(a>b) ? a : b;

        System.out.println("Maximum of two numbers: "+max);


    }
}
