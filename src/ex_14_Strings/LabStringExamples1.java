package ex_14_Strings;

public class LabStringExamples1 {
    public static void main(String[] args) {
        String s="Java";
        char c= s.charAt(2);
        System.out.println(c); //v

        int result = "abc".compareTo("ABC");
        System.out.println(result); //32 a=97 A=65 97-65=32

        int result1 = "ABC".compareTo("abc");
        System.out.println(result1); //-32

        int result2 = "ABC".compareTo("ABC");
        System.out.println(result2); //0

        int result3 = "abc".compareTo("abc");
        System.out.println(result3); //0

        int idx = "Java".indexOf("a");
        System.out.println(idx);//1

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2); //3

        boolean b = "".isEmpty();
        System.out.println(b); //true

        String s11 = String.join("*", "Java", "Python");
        System.out.println(s11); //Java*Python

        String s12 = "Java".replace('a', 'o');
        System.out.println(s12); //Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1); //true

        boolean b11 = "Java".startsWith("PRA");
        System.out.println(b11); //false

        String b2 = "Java".concat("Mava");
        System.out.println(b2);//JavaMava
    }
}
