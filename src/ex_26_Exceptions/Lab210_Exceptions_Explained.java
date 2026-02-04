package ex_26_Exceptions;

public class Lab210_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program!");
        String input_user = args[0]; //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 (if no input is given)
        Integer a = Integer.parseInt(input_user); //java.lang.NumberFormatException: For input string: "Java" (if input is a String)
        Integer output = 100/a; //java.lang.ArithmeticException: / by zero -> Unchecked exception
        System.out.println(output);
        System.out.println("End of the program!");
    }
}
/*
java.lang.ArithmeticException: / by zero -> Unchecked exception (if a=0)
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 (if no input is given)
java.lang.NumberFormatException: For input string: "Java" (if input is a String)
 */