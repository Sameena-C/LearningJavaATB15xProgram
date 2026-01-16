package ex_15_StringBuffer_StringBuilder;

public class Lab146_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Pramod");
        stringBuilder.append(123);
        System.out.println(stringBuilder); //Pramod123
    }
}
