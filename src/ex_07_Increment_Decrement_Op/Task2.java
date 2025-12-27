package ex_07_Increment_Decrement_Op;

public class Task2 {
    public static void main(String[] args) {
        int a = 3;

        int b = a++ * ++a;

        System.out.println(b);

        //Lno. |a  | A-> a++ | B-> ++a | b
        //5    | 3 |NA
        //7    | 3 | 3      | 5     | 15
        //9    | 15 <- 15
    }
}
