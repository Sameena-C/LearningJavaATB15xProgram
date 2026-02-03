package ex_24_ENUM;

public class Lab198_ENUM {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());//(ZERO - indexed position)
    }
}
