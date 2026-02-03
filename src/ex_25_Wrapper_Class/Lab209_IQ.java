package ex_25_Wrapper_Class;

public class Lab209_IQ {
    public static void main(String[] args) {
        Integer a=127;
        Integer b=127;

        System.out.println(a == b); // true (cached)

        Integer c=128;
        Integer d=128;

        System.out.println(c == d); //false! (not cached)
        System.out.println(c.equals(d)); //true

        //Java caches Integer values from -128 to 127, so == works for small number

        Integer num = null;
        int value = num; //NullPointerException!
        System.out.println(value);

        Integer aaa = 10;
        System.out.println(aaa.toString());
        System.out.println(aaa.toString() instanceof String);
    }
}
