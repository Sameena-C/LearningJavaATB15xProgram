package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        //in JDK > 13
        int itemCode =002;
        switch (itemCode)
        {
            case 001 -> System.out.println("0001");
            case 002 -> System.out.println("0002");
            case 003 -> System.out.println("0003");
            default -> System.out.println("Default");
        }
    }
}
/*
When using -> break statement are not required
arrow function allows only one statement to execute and break is included in that

 */