package ex_05_Typcasting;

public class Lab061_Typecasting_used {
    public static void main(String[] args) {
        int course =100;
        float gst =18.45f;
        // int total=course+gst; //narrowing - implicit -> not allowed
        int total= course + (int)gst; //Narrowing - explicit -> allowed
        System.out.println(total); //118 -> Data loss

        float total1= course+gst; //Widening - implicit -> allowed -> No Data loss
        System.out.println(total1); //118.45

        float total2= (float)course+gst; //Widening - Explicit -> allowed  -> No Data loss
        System.out.println(total1); //118.45

    }
}
