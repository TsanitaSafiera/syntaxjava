package Class9;

public class HW5 {
    public static void main(String[] args) {

        // Create an array of animals and store 5 elements into it. Using 2 different
        // loops print all elements from the array.

        String [] var={"Rabbit","Horse","Cat","Dog","Fox"};

        for (int i = 0; i < var.length; i++) {
            System.out.print(var[i]+" ");

        }

        System.out.println();

        for (String s : var) {
            System.out.print(s+" ");
            
        }

    }
}
