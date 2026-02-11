package ex_29_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabExample {
    public static void main(String[] args) {
        //Requirement where we want to modify the Collection
        //many times, then we always use the linkedlist.

        Scanner scanner= new Scanner(System.in);
        String continue_input = "Y";
        List<String > names = new ArrayList<>();

        while (continue_input.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name that you want to store");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to add another one? Y/N");
            continue_input = scanner.nextLine();


        }
        for (String name : names)
        {
            System.out.println(name);
        }
        scanner.close();
    }
}
