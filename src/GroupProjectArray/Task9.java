package GroupProjectArray;

public class Task9 {
    public static void main(String[] args) {

        // Write a java program to find the second largest
        //number in the array?

        int [] a={1,2,3,4,5,6};
        int largest=a[0];
        int secLargest=a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                secLargest=largest;
                largest=a[i];


        }
        System.out.println("Second largest number is: "+secLargest);
    }
}
