package ex_10_For_Loop;

import java.util.Scanner;

public class Lab112_For_Loop_Continue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        for (int i=0; i<num; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
/*
If num=50
0 to 49 will be printed without print 5
 */