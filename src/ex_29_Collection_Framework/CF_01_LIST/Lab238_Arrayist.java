package ex_29_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab238_Arrayist {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("cheese");
        list.add(123);
        list.add(true);

        System.out.println(list.size());

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for (Object o: list)
        {
            System.out.println(o);
        }
    }
}
