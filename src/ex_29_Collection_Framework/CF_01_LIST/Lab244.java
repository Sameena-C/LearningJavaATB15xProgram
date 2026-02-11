package ex_29_Collection_Framework.CF_01_LIST;

import java.util.LinkedList;

public class Lab244 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");  //adds at beginning
        list.addLast("Grapes");  //adds at end
        System.out.println(list);

        System.out.println(list.getFirst());//Mango
        System.out.println(list.getLast());//Garpes
        System.out.println(list.get(2)); //Banana

        list.removeFirst();
        System.out.println(list);
        list.remove("Banana");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Cherry"));

    }
}
