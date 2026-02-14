package ex_29_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab253_P3 {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        //Map is Key - value
        //name : pramod,
        //rollno : 1
        //phone : 9876543210

        m1.put("name", "pramod");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1); //order doesnot matter because of Hashing

        Map m2 = new LinkedHashMap();
        m2.put("name", "pramod");
        m2.put("rollno", 1);
        m2.put("phone", 987654321);
        System.out.println(m2); //order is maintained

        Map m3 = new TreeMap();
        m3.put("name", "pramod");
        m3.put("rollno", 1);
        m3.put("phone", 987654321);
        System.out.println(m3); //Natural Sorting happens while displaying (sorted based on 1st letter of Key)


    }
}
