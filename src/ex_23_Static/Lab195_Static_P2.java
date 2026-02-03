package ex_23_Static;

public class Lab195_Static_P2 {

}

class ATB{
    int phone_np;
    String name;

    static String course_name = "ATB";

    static void markAttendance(){
        System.out.println("Mark Attendance");
     //   System.out.println(this.phone_np);
        // static functions cannot use Non-static variables/members of the class
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static class A{

    }
}
