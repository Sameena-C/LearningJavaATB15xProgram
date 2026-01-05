package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {
        char code ='C';
        switch (code){
            default:
                System.out.println("Hello");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
/*
What is the output?
Hello
65

code C is not having matching value so default print will execute and
65 is also on the output because default is not having break statement.

we can keep default as 1st last doesn't matter
 */