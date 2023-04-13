package Class10;

public class E5D2Array {
    public static void main(String[] args) {

        int [][] matrix={
                // index always length minus 1
                {10,20,30,40,50},
                {20,50,65,20},
                {102,54,60},
                {20,50}
        };

        for (int row = 0; row < matrix.length; row++) {
            // int [] arr=matrix[row]; => will return the complete 1D
            // array at the index specified by the value of row
            for (int column= 0; column < matrix[row].length; column++) {
                System.out.print(matrix [row][column]+" ");

            }
            System.out.println();

        }


    }
}
