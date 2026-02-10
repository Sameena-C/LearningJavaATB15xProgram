package ex_29_Collection_Framework.CF_Task;

import java.util.Arrays;
import java.util.List;

public class LabConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Java", "Python", "C++"};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);
        System.out.println(list);

    }
}
