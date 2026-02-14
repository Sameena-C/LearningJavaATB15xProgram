package ex_29_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab257_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100); //not printed latest will be used
        map.put(null, 120);

        System.out.println(map);

        Map<Integer, Integer> ints = new HashMap<>();
        ints.put(1, 2);

        for (Map.Entry<String, Integer> item : map.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
           // System.out.println(item.getValue());
        }
    }
}
