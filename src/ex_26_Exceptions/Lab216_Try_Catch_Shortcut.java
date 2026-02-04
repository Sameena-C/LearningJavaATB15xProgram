package ex_26_Exceptions;

public class Lab216_Try_Catch_Shortcut {
    public static void main(String[] args) {
       try {
           int a = 10 / 0;
       }catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}
