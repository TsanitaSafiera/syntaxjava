package Class9;

public class HW6 {
    public static void main(String[] args) {

        // Create an array on integers and calculate the sum of all elements in an array

        int [] num={1,2,5,10,60,100};

        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];

        }
            System.out.println(sum);


    }
}
