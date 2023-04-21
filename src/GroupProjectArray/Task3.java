package GroupProjectArray;

public class Task3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store
        //odd and even numbers. Develop a program which will
        //identify/print the even numbers only.

        int [][] arr= {
                {10,20,30,40,50},
                {1,2,3,4,5,6,7},
                {8,9,10,11,12},
                {13,14,15,16,17,18}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                int element=arr[row][col];
                if (element% 2==0) {
                    System.out.print(element + " ");
                }
            }

        }
    }
}
