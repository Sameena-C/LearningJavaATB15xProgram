package ex_26_Exceptions;

public class Lab223_Jr_QA_Vs_Sr_QA2 {
    public static void main(String[] args) {
        //QA
        try{
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);  //NumberFormatException
            int b = 100/a; //ArithmeticException
            System.out.println(b);
        }
       // catch (Exception e)
        //Sr. QA
        catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
        System.out.println(e.getMessage());
        }


    }
}
