package ex_26_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab225_IQ {
    public static void main(String[] args) {
        System.out.println("Staring!");
        try{
            FileReader f = new FileReader(new File("C://abc.txt"));
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
/*
output:
Staring!
C:\abc.txt (The system cannot find the file specified)
End
 */