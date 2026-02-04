package ex_26_Exceptions;

public class Lab220_Try_Catch_Finally {
    public static void main(String[] args) {
        int a1 = 1;
       // int a = Integer.parseInt(args[0]);
        int c = 0;
        try {
            c = 10/a1;
        } catch (Exception e){
            System.out.println(e.getMessage());
   //         e.printStackTrace();
        } finally {
            System.out.println("I will be always executed");
        }





    }
}
