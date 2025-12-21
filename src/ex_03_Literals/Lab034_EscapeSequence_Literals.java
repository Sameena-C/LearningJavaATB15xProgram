package ex_03_Literals;

public class Lab034_EscapeSequence_Literals {
    public static void main(String[] args) {
        //Escape Sequence
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("SameenaChakoli");
        System.out.println("Sameena"+new_line+"Chakoli");
        System.out.println("Sameena\nChakoli");

        System.out.println("Sameena"+tab_line+"Chakoli");
        System.out.println("Sameena\tChakoli");

        System.out.println("Sameena"+back_space+"Chakoli"); // return 1 character before backspace
        System.out.println("Sameena\bChakoli");

        System.out.println("Sameena chakoli"+carriage_return+"Chakoli"); //removes entire word or String which is before carriage_return
        System.out.println("Sameena\rChakoli");

        System.out.println("-----------");

        System.out.println("Hi, This is First Line"+new_line+"This is second line\n This is third line");

    }
}
