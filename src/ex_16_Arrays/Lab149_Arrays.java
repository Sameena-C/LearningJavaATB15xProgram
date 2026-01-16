package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a=10;
        int marks[] = {91, 90, 51, 100, 91, 92, 98};
        int[] marks2 = {91, 90, 51, 100, 91, 92, 98};

        boolean [] is_married = {true, true, false};
        String [] names = {"pramod", "lucky", "dutta"};
        //Not allowed -> String [] names = {"pramod", "lucky", "dutta", 34};

        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.14f;
        values[2] = 5.14f;
      //  values[3] = 5.14f;

        for(String name: names)
        {
            System.out.println(name);
        }



    }
}
