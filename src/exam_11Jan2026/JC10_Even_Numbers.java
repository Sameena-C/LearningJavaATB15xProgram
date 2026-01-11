package exam_11Jan2026;
/*
10) Print Even Numbers

Description:
Write a Java program to print all even numbers
between 1 and 50 using a do-while loop.
 */
public class JC10_Even_Numbers {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }while(i<=50);
    }

}
