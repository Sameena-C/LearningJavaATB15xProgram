package ex_27_MultiThreading;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        // 34, 54, 76
        // 4.2, 3.4, 1.2
        // p, z, a

        int maxput = maximumNumberof(34, 54, 76); //This wont work for double Datatype
        System.out.println(maxput);

        double maxput_d = maximumNumberof_d(4.2, 3.4, 1.2);
        System.out.println(maxput_d);

        String maxput_S = maximum("p", "z", "a");
        System.out.println(maxput_S);


    }

    public static int maximumNumberof(int a, int b, int c)
    {
        int max = a;
        if(b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        return max;
    }

    public static String maximum(String x, String y, String z)
    {
        String max = x; // assume x is initially the largest

        if(y.compareTo(max) > 0)
        {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0)
        {
            max = z; // z is the largest now
        }
        return max; // returns the largest object

    }

    public static double maximumNumberof_d(double a, double b, double c)
    {
        double max = a;
        if(b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        return max;
    }
}
