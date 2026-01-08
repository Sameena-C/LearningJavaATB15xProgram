package ex_11_While_Loop;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        int i=1;
        while (i<=num)
        {
            fact=fact*i;
            i++;

        }
        System.out.println("Factorial => "+fact); //120
    }
}
