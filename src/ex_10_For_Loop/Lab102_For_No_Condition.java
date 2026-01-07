package ex_10_For_Loop;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++)
        {
            System.out.println(i);
        }
    }
}
/*
output:
There is no condition so for loop will execute infinite times

Also exit code is 130 means force stop, abnormal exit
 */