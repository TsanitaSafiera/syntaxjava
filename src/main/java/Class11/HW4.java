package Class11;

public class HW4 {
    public static void main(String[] args) {

        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int [][] arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        int sum=0;
        for (int[] arr1 : arr) {
            for (int i : arr1) {
                sum=sum+i;

            }

        }
                System.out.println(sum);




        }

}
