package GroupProjectArray;

public class Task4 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program
        //which will calculate the sum of even and odd numbers
        //for that array.

        int [][] array={
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14},
                        {15,16,17,18}
        };
        int sumOdd=0;
        int sumEven=0;
        int number;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                number=array[i][j];
                if (array[i][j]%2==0){
                    sumEven+=number;
                }else {
                    sumOdd+=number;
                }


            }

        }
        System.out.println("Sum of even= "+ sumEven);
        System.out.println("Sum of odd= "+ sumOdd);
    }
}
