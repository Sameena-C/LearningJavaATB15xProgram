package ex_26_Exceptions;

public class Lab219_IQ {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c; //vulnerable code that should be try and catch!!
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
