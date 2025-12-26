package ex_07_Increment_Decrement_Op;

public class Lab070_I_D_Op_Pre {
    public static void main(String[] args) {

        int a=10;
        int b=++a;
        System.out.println(b); //11
        System.out.println(a); //11

      //  ++a -> a=a+1
        //Exp and Result Table
        //Line No | a | Result b
        // 6 | 10 | NA
        // 7 | 11 | 11
        //8 | 11 | NA  a - print
        // 9 | 11 | 11 b - print

    }
}
