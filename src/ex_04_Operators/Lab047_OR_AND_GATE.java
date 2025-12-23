package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        //OR operator
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //AND operator
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

    }
}
