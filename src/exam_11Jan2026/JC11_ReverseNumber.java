package exam_11Jan2026;
/*
11) Reverse a Number

Description:
Write a Java program to reverse a given number using a do-while loop.
 */
public class JC11_ReverseNumber {
    public static void main(String[] args) {
        int i=1234;
        int rev=0;

        do{
            int num=i%10;
            rev=(rev*10) + num;
            i = i/10;
        }while(i!=0);

        System.out.println(rev);
    }

}
