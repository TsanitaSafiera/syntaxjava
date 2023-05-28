package Class11;

public class E1D2Array {

    public static void main(String[] args) {
        // print only odd number
        int [][] arr= {{10,20,30,40,50},
                        {1,2,3,4,5},
                        {5,5,5,5,5},
                        {10,8,6,4,2}
        };
        // print only odd numbers from this 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                int element=arr[row][col];
                if (element% 2==1) {// if (arr[row][j]%2!=0)
                    System.out.print(element + " ");
                }
            }

        }
    }
}
