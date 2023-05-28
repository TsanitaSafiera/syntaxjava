package GroupProjectArray;

public class Task8 {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int [] a={1,2,3,4,5,6};
        int max=a[0];
        int min=a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max=a[i];

        }
        System.out.println("Max number is: "+max);

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min=a[i];

        }
        System.out.println("Min number is: "+min);


    }
}
