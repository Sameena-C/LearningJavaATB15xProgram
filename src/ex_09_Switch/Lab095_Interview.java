package ex_09_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a= 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
/*
What is the output?
10

int a=11; is given to fool you, nothing we are doing with int a=11 here
here switch(-1) is matching with -1 case value and that print statement is executing
 */

