package ex_29_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
       // fruits1.add(123);
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List veg=new ArrayList();
        veg.add("onion");
        veg.add("tomato");
        veg.add("potato");
        System.out.println(veg);

        List all_fruits_veg = new ArrayList();
        all_fruits_veg.add(fruits1);
        all_fruits_veg.add(fruits2);
        all_fruits_veg.add(veg);
        System.out.println(all_fruits_veg);

        System.out.println(all_fruits_veg.size());
        System.out.println(all_fruits_veg.get(1));


    }
}
