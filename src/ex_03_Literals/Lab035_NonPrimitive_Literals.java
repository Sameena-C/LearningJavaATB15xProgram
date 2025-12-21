package ex_03_Literals;

public class Lab035_NonPrimitive_Literals {
    public static void main(String[] args) {
        char rupee = '₹';
        System.out.println(rupee);

        String name= "Sameena";
        System.out.println(name);
        int [] arrays_of_items = new int[10];

        //char A='10'; //cannot be written as 10 is not a single character
        char A='0';
        System.out.println(A);

        //Strange Things

        int binary=0b1010;
        int hex=0xFF;
        long amount=1_000_000L; // _ is possible
        System.out.println(amount);

        char c='A'; //ASCII value is 65
        System.out.println(c);

        //Null Literal is used with Non-Primitive Datatypes
        //Null is not associated with integers
        String name1=null;
        String name2=""; //blank is a character memory is allocated

        System.out.println(name1);
    }
}
