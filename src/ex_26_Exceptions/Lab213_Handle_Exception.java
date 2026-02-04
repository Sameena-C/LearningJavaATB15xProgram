package ex_26_Exceptions;

public class Lab213_Handle_Exception {
    public static void main(String[] args) {
        int a=0;
        try {
            a = 10 / 0; //java.lang.ArithmeticException: / by zero => Unchecked Exception
           // a = 10 / 5;
        } catch (Exception e)
        {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("Divde by zero not allowed!!");
        }
        System.out.println(a);
    }
}
