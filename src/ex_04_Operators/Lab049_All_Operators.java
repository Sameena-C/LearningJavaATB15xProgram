package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;

        int a=10;
        int b=20;

        System.out.println(a + b); //30 return type is integer
        //Whenever logical & Relational operator are there the return type is always boolean
        System.out.println(a > b); //F
        System.out.println(a < b); //T
        System.out.println(a >= b); //F
        System.out.println(a <= b); //T
        System.out.println(a == b); //F
        System.out.println(a != b); //T

        //Compound Assignment operator
        int age =10;
        age +=10; // age=age+10
        System.out.println(age); //20

        int age1=10;
        age1 -= 10; // age1=age1-10
        System.out.println(age1); //0

        int age2 =10;
        age2 /= 10; // age2=age2/10
        System.out.println(age2); //1

        //Optional to learn - Digital Electronics
        //Bitwise - Not important for Automat ion

        //~ - Bitwise NOT
        // >> - Right shift
        // << - Left shift
        // ^ - XOR

        //Unary Operator
        int a11 = +10;
        int a12 = -110;


    }
}
