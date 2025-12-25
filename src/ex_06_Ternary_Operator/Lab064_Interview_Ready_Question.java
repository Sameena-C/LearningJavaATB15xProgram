package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;
        String result = age>18 ? (age>21 ? "can vote & become member" : "cannot vote but can become member") : "Cannot Vote";
        System.out.println(result);
    }
}
