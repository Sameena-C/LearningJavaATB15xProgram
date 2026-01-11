package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_function();
        return_int();
        return_boolean();
        return_float_pi_value();
    }
    static void non_return_function(){
        System.out.println("Print something no return or return type");
    }

    static int return_int(){
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }
}
