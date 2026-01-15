package ex_14_Strings;

public class Lab139_Strings_Interview {
    public static void main(String[] args) {
        Lab139_Strings_Interview o=new Lab139_Strings_Interview();
        System.out.println(o); //ex_14_Strings.Lab139_Strings_Interview@27716f4 prints the location

        String name="pramod";
        System.out.println(name); //pramod because toString() is by default called here

        name = name.toUpperCase();
        System.out.println(name); //PRAMOD
    }
}
