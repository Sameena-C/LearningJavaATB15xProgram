package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name="Sameena";
        String last_name="Chakoli";

        int a=10;
        int b=20;

        /*JVM goes Left to Right the moment it encounters String it does
        concatenation only so here 1020 is displayed
        Rule 1: first time if + is working as concatenation 2nd time also it works as concatenation*/
        System.out.println(first_name + last_name + a + b); //SameenaChakoli1020

        /* Rule2: first time if + is with integers than arithmetic is done,
        cannot perform addition with Strings  */
        System.out.println(a + b + first_name + last_name); //30SameenaChakoli

        /*Because of brackets addition is performed*/
        /*BODMAS formula*/
        /*Because of brackets integer calculation is done*/
        System.out.println(first_name + last_name + (a+b)); //SameenaChakoli30

        System.out.println(first_name+a+b+last_name); //Sameena1020Chakoli
        System.out.println(first_name+a+last_name+b); //Sameena10Chakoli20
        System.out.println((a)+first_name+(b)+last_name); //10Sameena20Chakoli
    }
}
