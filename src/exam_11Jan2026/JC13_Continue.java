package exam_11Jan2026;
/*
13) Continue Statement Example

Description:
Write a Java program to print numbers from 1 to 10,
but skip printing the number 5 using the continue statement.
 */
public class JC13_Continue {
    public static void main(String[] args) {
            for(int i=1; i<=10; i++)
            {
                System.out.println(i);
                if(i==5)
                {
                    continue;
                }
            }
    }
}
