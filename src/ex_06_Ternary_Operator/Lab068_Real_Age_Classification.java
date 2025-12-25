package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        //A user input will give you an age
        //You need to check if the user is minor, adult or senior citizen

        //User will give you input via the Command line
        String age_input_String = args[0];
        System.out.println(age_input_String instanceof String);
        int age_user_input = Integer.parseInt(age_input_String);

        String result=(age_user_input < 18) ? "Minor" : (age_user_input <=60 ? "Adult" : "Senior Citizen");
        System.out.println(result);

    }
}
