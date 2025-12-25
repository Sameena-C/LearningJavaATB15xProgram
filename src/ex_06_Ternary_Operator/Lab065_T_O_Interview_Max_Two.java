package ex_06_Ternary_Operator;

public class Lab065_T_O_Interview_Max_Two {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int max= (x>y) ? x : y;
        System.out.println(max);
        int min= (x>y) ? y : x;
        System.out.println(min);
    }
}
