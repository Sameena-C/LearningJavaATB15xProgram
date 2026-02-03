package ex_25_Wrapper_Class;

public class Lab208_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a=10;

        Integer b = a;
        System.out.println(b); //b has no attributes,no methods
//Boxing - Primitive datatype is converted to wrapper - Automatic JVM will do it

        Integer aa = 43;
        int a1 = aa; //Automatically Unboxing will happen //aa lost the attributes and methods/ behaviour

        int i = Integer.parseInt("123");

    }
}
