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


    }
}
