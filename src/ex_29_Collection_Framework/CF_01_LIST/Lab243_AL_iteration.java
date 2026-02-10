package ex_29_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab243_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        List<String> mylist2 = new ArrayList<>();  //<> is optional at right side but mandatory at left side

        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println("- To Print ArrayList - 1 ");

        for(String name: mylist)
        {
            System.out.println(name);
        }

        System.out.println("- To Print ArrayList - 2 ");

        for(int i=0; i < mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }

        System.out.println("- To Print ArrayList - 3 ");

        Iterator iterator = mylist.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        }
}
