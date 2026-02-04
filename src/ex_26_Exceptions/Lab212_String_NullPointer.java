package ex_26_Exceptions;

public class Lab212_String_NullPointer {
    public static void main(String[] args) {
        // Unchecked Exception
        String name = null; //java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
        name.trim();

    }
}
