package ex_05_Typcasting;

public class Lab060_Typecasting {
    public static void main(String[] args) {
        long phone=987654321L;
       // short s = phone; //Narrowing implicit - not allowed
        short s1= (short) phone; //Narrowing explicit - allowed

    }

}
