package ex_10_For_Loop;

public class Lab107_ForLoop_2 {
    public static void main(String[] args) {
        for (long i=1l; i<10; i++)
        {
            System.out.println(i); //output: 0 to 9
        }

        for (float f=0.0f; f<10.67; f++)
        {
            System.out.println("Hi, Float -> " + f); //output 0.0 to 10.0
        }
    }
}
/*
We can also you float and long in case of for loop but these are not useful much - rarely are used
 */