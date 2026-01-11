package exam_11Jan2026;
/*
3) Explicit Type Casting

Description:
Write a Java program to
convert a double value into an int using explicit type casting and print both values.
 */
public class JC03_Explicit_TypeCasting {
    public static void main(String[] args) {
        double d=56.78;
        int i=(int) d;

        System.out.println("double value: "+d);
        System.out.println("int value: "+i);
    }
}
