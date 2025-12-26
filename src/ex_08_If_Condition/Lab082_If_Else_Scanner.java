package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {

        //Allowed to vote or not - age
        //If age>18  -> allowed to vote
        //else age > 18 -> Not allowed to vote

        //How to take the user Input
        //1. CLI Input
        //int age= Integer.parseInt(args[0]);
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Age!");
            int age=scanner.nextInt();
            System.out.println(age);
            if(age>19)
            {
                System.out.println("Hi");
            }


    }
}
