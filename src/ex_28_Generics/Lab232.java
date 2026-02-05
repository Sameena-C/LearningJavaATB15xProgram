package ex_28_Generics;

public class Lab232 {
    public static void main(String[] args) {
        temp_sum(2, 4);
        temp_sum("Pramod", "Dutta");
    }
//    static void temp_sum(Integer a, Integer b){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    static void temp_sum(String a, String b){
//        System.out.println(a);
//        System.out.println(b);
//    }

    static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
/*
    static <SAM> SAM temp_sum(SAM a, SAM b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
*/
}


