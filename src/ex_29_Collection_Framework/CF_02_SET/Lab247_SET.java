package ex_29_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab247_SET {
    public static void main(String[] args) {
        Set hs = new HashSet(10); //We can set the default capacity
        hs.add("Pramod"); //sadaslhfSJDKSLAF372109UIJCSL
        hs.add("Pramod"); //sadaslhfSJDKSLAF372109UIJCSL
        hs.add("dramod"); //uetwqudhxlkj980ijlkmnyiysosj0
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
    }
}
/*
we cannot add duplicate elements because their hashcode will be same
cannot have two people with same aadhar number
 */