package ex_07_Increment_Decrement_Op;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //ERT
        //A -> ++a
        //B -> ++a
        //L.No | a | A | B
        // 5 | 10 | NA | NA
        // 6 |    | 11 | 12 -> A+B = 23
        // 7 | 12
    }
}
