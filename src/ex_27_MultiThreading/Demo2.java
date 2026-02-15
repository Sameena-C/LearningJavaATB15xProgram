package ex_27_MultiThreading;

public class Demo2 {
    public static <T> void temp(T a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
      temp(23);
      temp(23.5);
      temp("Pramod");
      temp(true);
      temp('d');
    }

}
