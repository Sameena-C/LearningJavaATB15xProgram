package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a=0;
//        while(a<0){
//            System.out.println(a);
//            a++;
//        }
        /*Above program will not give any output because condition is not satisfied
        Line 7, 8 will not execute
         */

        do{
            System.out.println(a);
            a++;
        }while (a<0);

        /*
        Above program will 0 as output because condition is not checked
        Line 15, 16 will execute one time and then the condition is checked
         */

    }
}
