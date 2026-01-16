package ex_15_StringBuffer_StringBuilder;

public class Lab144_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {
        //String - 90%

        String s0 = "Pramod";
        String s1 = new String("Pramod");

        //less than 10% used
        StringBuffer stringBuffer=new StringBuffer("Pramod");  //OA

        StringBuilder stringBuilder=new StringBuilder("Pramod"); //OA

        System.out.println(stringBuffer.reverse()); //domarP
        System.out.println(stringBuilder.reverse()); //domarP
    }
}
