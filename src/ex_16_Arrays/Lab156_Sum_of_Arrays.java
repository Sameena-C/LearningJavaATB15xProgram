package ex_16_Arrays;

public class Lab156_Sum_of_Arrays {
    public static void main(String[] args) {
        int [] nums={12, 34, 10};
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum=sum+nums[i];
        }
        System.out.println(sum);

    }
}
