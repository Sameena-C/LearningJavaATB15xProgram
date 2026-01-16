package ex_16_Arrays;

import java.sql.DataTruncation;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String[] name_atb15x = new String[3];

        System.out.println(name_atb15x[0]); //null
        System.out.println(name_atb15x[1]); //null
        System.out.println(name_atb15x[2]); //null

        name_atb15x[0]="Aditi";
        name_atb15x[1]="Jatin";
        name_atb15x[2]="Nikita";

        System.out.println(name_atb15x[0]); //Aditi
        System.out.println(name_atb15x[2]); //Nikita
        System.out.println(name_atb15x[1]); //Jatin

    }
}
