package ex_26_Exceptions;

public class Lab217_Try_IQ {
    public static void main(String[] args) {
        String s1=null;
        /*
        try {
            s1.trim();
        }catch (NullPointerException e)
        {
            System.out.println("Null Error");
        }
        try {
            int a = 10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic Error");
        }

         */
        try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic Error");
        } catch (Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");
    }
}
/*
Output:
java.lang.NullPointerException: Cannot invoke "String.trim()" because "s1" is null
 */