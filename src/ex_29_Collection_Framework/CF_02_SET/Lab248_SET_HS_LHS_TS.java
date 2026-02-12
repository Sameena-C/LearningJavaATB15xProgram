package ex_29_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab248_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon"); //duplicates not allowed
       // hs.add(123); //cannot add because we have specified String
        hs.add(null);
        hs.add(null); //duplicates not allowed
        System.out.println(hs);

        /*
[null, Apple, Watermelon, Orange]

Order is random based on hashes (encryption and decryption is taken care by JVM)
 */

        System.out.println("----------------------------------------");

        Set lhs = new LinkedHashSet();
        //LinkedList  mechanism to store the element,
        //order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        /*
        Output:
        [Dpple, apple, Orange, Watermelon, null]
        false
        false
        5
         */

        System.out.println("------------------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
       // ts.add(123);
       // ts.add(null); //java.lang.NullPointerException
        /* throws exception java.lang.ClassCastException
        different datatypes are not allowed is TreeSet
        because sorting cannot be done*/
        System.out.println(ts);
/*
[Dapple, Orange, Watermelon, apple]

Sorting is done based on ASCII value of the first alphabet
 */
    }
}
