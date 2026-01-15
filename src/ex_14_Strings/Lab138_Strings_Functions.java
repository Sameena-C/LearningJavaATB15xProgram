package ex_14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {
        char c='A';
        System.out.println(c); //A

        char c1='S';
        System.out.println(c1); //S

        System.out.println(c+c1); //148 behaves like integer because of + (addition)

        String s1="ABCD";
        System.out.println(s1); //ABCD

        System.out.println(s1.length()); //4 count the number of characters
        System.out.println(s1.toLowerCase());   //abcd
        System.out.println(s1.toUpperCase());   //ABCD
        System.out.println(s1.concat("E")); //ABCDE

    }
}
