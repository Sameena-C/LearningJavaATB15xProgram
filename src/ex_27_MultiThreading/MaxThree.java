package ex_27_MultiThreading;

public class MaxThree {
    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c)
    {
        //DT custom class created

        DT max = a;
        if( b.compareTo(max) > 0)
        {
            max = b;
        }
        if( c.compareTo(max) > 0)
        {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34, 56, 24));
        System.out.println(maximumOf(4.5, 3.4, 6.5));
        System.out.println(maximumOf('p', 'z', 's'));

    }


}
