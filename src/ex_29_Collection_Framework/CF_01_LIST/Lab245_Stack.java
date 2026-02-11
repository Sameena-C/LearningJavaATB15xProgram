package ex_29_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab245_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        //Last In First Out
        s1.add("Pramod");
        s1.add("Amit");
        s1.add("Dutta");
        System.out.println(s1);
        System.out.println(s1.size());

        System.out.println(s1.peek()); //Dutta
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);

        System.out.println(s1.add("Snehal"));
        System.out.println(s1);

        s1.add("Chetan");
        s1.add("Chetan");
        s1.push("Vijay");
        System.out.println(s1);

        s1.add(2, "Lucky");
        System.out.println(s1);

        s1.push("Darshan");
        s1.addLast("Jagmeet");
        System.out.println(s1);

    }
}
