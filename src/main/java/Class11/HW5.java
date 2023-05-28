package Class11;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */

        int [][] arr= {
                {1, 2, 3, 4},
                {4, 5, 6, 6},
                {7, 8, 9, 10}
        };

        for (int[] arr1 : arr) {
            for (int i : arr1) {
                if (i%2==0){
                    System.out.print(i+" ");
                }



        }

        }
    }
}
