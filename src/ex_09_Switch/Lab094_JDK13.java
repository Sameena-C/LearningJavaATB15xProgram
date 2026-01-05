package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemCode=006;
        switch (itemCode){
            case 001, 002, 005:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
/*
One more new feature added in > JDK13 is Multiple case values are allowed
conditions with same output, can club the same conditions
Only supported in JDK greater than 13
 */