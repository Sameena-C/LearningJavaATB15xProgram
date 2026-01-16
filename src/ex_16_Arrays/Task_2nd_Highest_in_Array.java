package ex_16_Arrays;

public class Task_2nd_Highest_in_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max=numbers[0];
        int second_highest=numbers[0];

        for (int i=0; i<numbers.length; i++){
            if( numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        System.out.println("First Highest in the Array is: " +max);

        for (int i=0; i<numbers.length; i++){
            if( numbers[i] != max && numbers[i] > second_highest)
            {
                second_highest = numbers[i];
            }
        }
        System.out.println("Second Highest in the Array is: " +second_highest);


    }

}
