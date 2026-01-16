package ex_15_StringBuffer_StringBuilder;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); //PramodDutta ->Here 1 String is only created and Pramod is replaced by PramodDutta

        String s1 = "Pramod";
        s1 = s1 + "Dutta";
        System.out.println(s1); //PramodDutta ->Here Pramod is created and also PramodDutta String is also created 2 strings
    }
}
