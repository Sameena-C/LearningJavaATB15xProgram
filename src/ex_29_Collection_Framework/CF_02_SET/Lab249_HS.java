package ex_29_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab249_HS {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
