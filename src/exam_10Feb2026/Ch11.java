package exam_10Feb2026;
/*
Calculator Method Overloading
Write a program to demonstrate method overloading
by creating multiple "add" methods with different parameters.

Input: add(5, 3), add(2.5, 3.7), add(1, 2, 3)
Output: Integer addition: 8 Double addition: 6.2 Three integers addition: 6
Explanation:Method overloading allows multiple methods
 with the same name but different parameter lists in the same class.
 */
public class Ch11 {
     void add(int a, int b)
    {
        System.out.println("Integer addition: " + (a+b));
    }
    static void add(double a, double b)
    {
        System.out.println("Double addition: " + (a+b));
    }
    static void add(int a, int b, int c)
    {
        System.out.println("Three integers addition: "+ (a+b+c));
    }
    public static void main(String[] args)
    {
        Ch11 c1=new Ch11();
        c1.add(5, 3);
        add(2.5, 3.7);
        add(1, 2, 3);

    }
}
