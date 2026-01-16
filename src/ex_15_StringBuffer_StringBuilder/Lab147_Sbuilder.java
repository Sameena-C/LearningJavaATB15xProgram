package ex_15_StringBuffer_StringBuilder;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); //Hello World
        sb.reverse();
        System.out.println(sb); //dlroW olleH
    }
}
