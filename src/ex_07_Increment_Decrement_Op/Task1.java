package ex_07_Increment_Decrement_Op;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

       //L.No |  a | A -> a++  | B -> a++ | C -> a++
        //5   | 10 |
        //6   |    | 10          | 11      | 12
        // 7  | 33 <- a

    }
}
