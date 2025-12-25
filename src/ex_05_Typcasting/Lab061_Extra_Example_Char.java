package ex_05_Typcasting;

public class Lab061_Extra_Example_Char {
    public static void main(String[] args) {
        char ch='A';
        int ascii = ch; //Widening
        System.out.println(ascii);

        int num =66;
        char letter=(char) num; //Narrowing
        System.out.println(letter);
    }
}
