package ex_28_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_REAL_AUTOMATION {
    public static void main(String[] args) {
        List<String> myList =new ArrayList<String>();
        myList.add("Pramod");
        myList.add("Dutta");
       // myList.add(123); => not allowed

       // By default it is generic in nature
        List myList1 =new ArrayList();
        myList1.add("Pramod");
        myList1.add("Dutta");
        myList1.add(123);
    }
}
