package ex_26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab226_Throws {
    public static void main(String[] args) {

    }
//    static void t() {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("C://a.txt");
//        }catch (FileNotFoundException e)
//        {
//            throw new RuntimeException(e);
//        }

    static void t()throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
/*
throws is added to functions/methods and try-catch is added to block of code
 */