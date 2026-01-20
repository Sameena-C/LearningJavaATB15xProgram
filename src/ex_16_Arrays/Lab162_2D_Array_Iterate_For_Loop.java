package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int [][] matrix={
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+ "|");
               // System.out.print("*" + "|");
            }
            System.out.println(" ");
        }
    }
}
