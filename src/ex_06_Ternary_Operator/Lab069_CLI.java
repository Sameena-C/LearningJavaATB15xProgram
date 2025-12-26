package ex_06_Ternary_Operator;

public class Lab069_CLI {
    public static void main(String[] args) {

        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int n3=Integer.parseInt(args[2]);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);


        int min= (n1 < n2) ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);
        System.out.println(min);
    }
}
