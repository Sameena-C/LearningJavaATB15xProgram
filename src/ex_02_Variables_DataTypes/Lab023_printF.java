package ex_02_Variables_DataTypes;

public class Lab023_printF {
    public static void main(String[] args) {
       // System.out.println("It will add a new line");
       // System.out.print("It will not add a new line");

        System.out.printf("This is normal text");
        System.out.printf("This is normal text");

        //when we execute both printf statements It will look like normal print command with no new line

        int a=10;
        System.out.println(a);
        System.out.println("Value of a ->" + a);
        System.out.printf("Value of a is %d", a); //%d means integer

        // %d -> int, byte, long, short - data type
        // %s -> String
        // %f -> float, double
        // %b -> boolean

     //   Advantage is we can replace the values - Used for Formatting the output
        int  aa=100;
        int  bb=200;
        System.out.printf("When you multiply aa bb result is = %d * %d", aa,bb);
        System.out.printf("Formatting the aa=%d and bb=%d", aa, bb);
    }
}
