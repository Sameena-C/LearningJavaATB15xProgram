package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name="Pramod";
        System.out.println(name); //Pramod
        boolean result=name.contains("m");
        System.out.println(result); //true

        //Strings are Immutable in nature.
        name.toUpperCase();
        System.out.println(name); //Pramod,
        // captial PRAMOD is not printed because String is immutable
        // and, it is not reassigned the value of name if name=name.toUpperCase(); then
        // System.out.println(name); prints Pramod
        System.out.println(name.toUpperCase()); //PRAMOD

        name="Dutta";
        System.out.println(name); //Dutta
    }
}
