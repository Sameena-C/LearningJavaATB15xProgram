package ex_29_Collection_Framework.CF_04_MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab255_P5 {
    public static void main(String[] args) {
        Map<String, Integer> prices = new TreeMap<>();

        prices.put("Banana", 40);
        prices.put("Apple", 120);
        prices.put("Cherry", 200);
        prices.put("Date", 350);
        System.out.println(prices); //Natural sorting based on keys
    }
}
