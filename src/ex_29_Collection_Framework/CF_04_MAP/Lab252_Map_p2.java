package ex_29_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab252_Map_p2 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();
       // Map m4 = new EnumMap(); //Not used at all
        Map m5 = new Hashtable();
        Map m6 = new WeakHashMap();

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 95);
        marks.put("Bob", 82);
        marks.put("Charlie", 90);
        marks.put("Dave", 78);
        System.out.println(marks); //prints in random order because it follows Hashing

        //Accessing
        System.out.println(marks.get("Alice"));
        System.out.println(marks.get("Dutta"));
        System.out.println(marks.getOrDefault("Pramod", 0)); //0 when Key is not found

        //Update
        marks.put("Bob", 88);
        System.out.println(marks.get("Bob"));

        //Check
        System.out.println(marks.containsKey("Charlie"));
        System.out.println(marks.containsValue(100));

        //Size
        System.out.println(marks.size()); //4

        //Remove
        marks.remove("Dave");
        System.out.println(marks);




    }
}
