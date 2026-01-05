package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char ch='A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");

        }
    }
}
/*
Is this a valid syntax? If Yes, what will be the output
Yes, Valid syntax
output
Match ASCII

Because char is an imposter, char nothing be integer only A ASCII value is 65
 */