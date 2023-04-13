package Class9;

public class HW7 {
    public static void main(String[] args) {

        // From an array of integer elements find the largest number.

        int [] num={6,1,9,100};
        int max=num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max)
                max=num[i];

        }
        System.out.println(max);

        /* create a variable to store the largest assumed number
        to go through all the numbers from the array one by one
        compare the assumed largest number with all the numbers in the array
        once we are done looping through all the numbers print the results
         */

        /*int largest=numbers[0];
        for (int num : numbers) {
            if (num>largest){
                largest=num;
            }
            System.out.println(largest);

         */

        //}

    }
}
