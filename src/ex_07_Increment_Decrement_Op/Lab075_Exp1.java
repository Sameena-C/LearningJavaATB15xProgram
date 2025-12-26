package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // A-> a++
        // B-> ++a

        //ERT
        //Lno | a | A | B
        // 6  | 10 | 10 | 12
        // 7 | 12

        //A+B -> 22
        //a -> 12
    }
}
