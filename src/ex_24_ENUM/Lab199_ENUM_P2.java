package ex_24_ENUM;

public class Lab199_ENUM_P2 {

    public static void main(String[] args) {
        Day today= Day.MONDAY;

        switch (today){
            case MONDAY -> System.out.println("Monday");
            case FRIDAY -> System.out.println("Friday");

        }
        System.out.println(API_URLS.valueOf("google"));
    }
}
