package ex_25_Wrapper_Class;

public class Lab205_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        //a. => doesnot have any attribute nor have any method like a.len()
        System.out.println(a);

        Integer a1 = 10;
        System.out.println(a1.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
