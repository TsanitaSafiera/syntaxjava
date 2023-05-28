package Class11;

public class E7D2Array {
    public static void main(String[] args) {

        boolean [][] arr2D= {
                {true, false, true, true, false},
                {true,false,false,false,false}

        };
        // with the help of loops count how many times we have
        //true in above 2DArray
        int counter=0;
        for (boolean[] arr1D: arr2D) {
            for (boolean num : arr1D) {
                if (num==true) {
                    counter++;
                }
            }
        }

            System.out.println(counter);











    }

}

