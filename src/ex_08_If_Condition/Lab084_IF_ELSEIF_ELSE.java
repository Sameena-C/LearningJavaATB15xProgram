package ex_08_If_Condition;

import java.util.Scanner;

public class Lab084_IF_ELSEIF_ELSE {
    public static void main(String[] args) {
      //  int age = 34;
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
        String name=scanner.next();

        if(age > 34)
        {
            System.out.println("age > 34");

        } else if (age < 34) {
            System.out.println("age < 34");
        }
        else {
            System.out.println("age == 34");
        }

        scanner.close();

    }
}
