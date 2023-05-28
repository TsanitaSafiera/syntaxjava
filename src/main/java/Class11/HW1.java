package Class11;

public class HW1 {
    public static void main(String[] args) {


        // Create a 2D array(shorter way) in which first array
        // will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String [][] arr={
                    {"Wieke","Tsanita","Mutiara","Safiera"},
                    {"A","B","A","B"}
        };

        for (int row = 0; row < arr[1].length; row++) {
            if ( arr[1][row].equals("A") || arr[1][row].equals("B")){
                System.out.println(arr[0][row]+" grade is "+ arr[1][row]);
            }

        }


    }
}
