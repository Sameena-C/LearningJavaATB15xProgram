package ex_26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab211_Checked_Exception_Example {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exception
        FileInputStream fileInputStream=new FileInputStream("D:\\Test.xlsx");
    }
}
