package ex_26_Exceptions;

public class Lab218_IQ {
    public static void main(String[] args) {
        try {
            String input_user = args[0]; //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 (if no input is given)
            Integer a = Integer.parseInt(input_user); //java.lang.NumberFormatException: For input string: "Java" (if input is a String)
            Integer output = 100/a;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
            //new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }
    }
}
