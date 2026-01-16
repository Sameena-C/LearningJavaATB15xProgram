package ex_15_StringBuffer_StringBuilder;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb); //Java Programming

        sb.replace(0, 4, "C++");
        System.out.println(sb); //C++ Programming
    }
}
