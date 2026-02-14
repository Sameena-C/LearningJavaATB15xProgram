package ex_29_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class LabHashValue {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s2);

        Map m1 = new HashMap();
        m1.put("Pramod", 123);
        m1.put(123, 124);
        m1.put(true, 'D');

    }
}
class Student{}
