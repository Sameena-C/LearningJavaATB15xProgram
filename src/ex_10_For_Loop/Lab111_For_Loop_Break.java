package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        /*
        for(int i=0; i<50; i++)//How many times for loop runs and from where to where it runs? 50 times from 0 to 49 it runs
        {
            System.out.println(i);
            if(i==5)
            {
                break;
            }

        }
        System.out.println("End");

//output: 0 to 5
//End will be printed
 */

        for(int i=0; i<50; i++)//How many times for loop runs and from where to where it runs? 50 times from 0 to 49 it runs
        {

            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End");

        //output: 0 to 4 and End will be printed
    }
}
