package ex_10_For_Loop;

public class Lab108_ForLoop_3 {
    public static void main(String[] args) {
        int i = 10;
        for(; i > 0; i--)
        {
            System.out.println(i); //output is 10 to 1; 0 is not printed because 0 is not greater than 0
        }
    }
}
/*
Can we take initialization outside the for loop?
Yes it works
 */