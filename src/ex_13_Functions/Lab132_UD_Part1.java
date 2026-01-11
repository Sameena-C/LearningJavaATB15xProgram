package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
//        1. Without Parameters and Without Return Type.
//        2. Without Parameters but With Return Type
//        3. With Parameters and Without Return Type - **main**
//        4. With Parameters and With Return Type.

        //1. Without Parameters and Without Return Type.
        wop_wor_greet();

        //2. Without Parameters but With Return Type
        String msg=wop_wr_greet2();

        //3. With Parameters and Without Return Type
        greet_with_details("Sam", 65, 100);

        //4. With Parameters and With Return Type.
        int sum=sum_of_two_numbers(3, 4);

    }

    static int sum_of_two_numbers(int i, int i1) {
        return i+i1;
    }

    static void greet_with_details(String sam, int i, int i1) {
    }

    static String wop_wr_greet2() {
        return "sam";
    }

    static void wop_wor_greet() {
    }
}
