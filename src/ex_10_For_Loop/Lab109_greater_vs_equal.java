package ex_10_For_Loop;

public class Lab109_greater_vs_equal {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        /*
output
0 to 10 will be printed and loop executes 11 times
 */
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        /*
output
1 to 10 will be printed and loop executes 10 times
 */

        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        /*
output
0 to 9 will be printed and loop executes 10 times
 */
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(i);
        }
        /*
output
0 to 9 will be printed and loop executes 10 times

There is no difference between i++ and ++i when using in for loop both are same here
 */
    }
}
