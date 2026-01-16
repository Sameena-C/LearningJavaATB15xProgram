package ex_14_Strings;

public class LabStringExamples3 {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s); //va

        String a = "Java";
        char[] arr = a.toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean b = " ".isBlank();
        System.out.println(b); //true

        String s2 = "ab".repeat(3);
        System.out.println(s2); //ababab

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11); //true

        long count = "a\nb\nc".lines().count();
        System.out.println(count);//3

        System.out.println("=".repeat(10)); //to beautify the output we use this
        System.out.println("Hello ");
        System.out.println("=".repeat(10));
    }
}
