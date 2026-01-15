package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");

        /*
        1 String in SCP
        3 Strings in HA OA
         */

        // == Comparison - String check the ref in String

        System.out.println(s1 == s3); //false because location is different
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3); //false

        System.out.println(s1 == s4); //true
        System.out.println(s3 == s5); //false

        // equals ( content) -> value

        System.out.println(s1.equals(s2)); //true checks the value not the location
        System.out.println(s1.equals(s3)); //true
        System.out.println(s3.equals(s5)); //false
        System.out.println(s3.equalsIgnoreCase(s5)); //true

// equalsIgnoreCase -> pramod, PRAMOD, pRAMOD, Pramod, PraMOd all are equal




    }
}
