package Class9;

public class HW4 {
    public static void main(String[] args) {

        // Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.

        String [] car=new String[6];
        car[0]="Honda";
        car[1]="Toyota";
        car[2]="BMW";
        car[3]="Bentley";
        car[4]="Chevrolet";
        car[5]="Tesla";

        for (int i = 0; i < car.length; i++) {
            System.out.print(car[i] + " ");

        }

            System.out.println();

            for (String s : car) {
                System.out.print(s+" ");



        }
    }
}
