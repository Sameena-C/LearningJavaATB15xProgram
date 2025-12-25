package ex_05_Typcasting;

public class Lab059_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val=300;
        //0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 -> int 32 bits
       // byte b=val; //Implicit Narrowing  JVM will start crying - Not possible
        byte b2=(byte) val; //Explicit Narrowing
        System.out.println(b2); //44
        //0 0 1 0 1 1 0 0     -> byte 8 bits          //0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
        System.out.println(300%128);
    }
}
