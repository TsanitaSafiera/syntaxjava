package GroupProjectArray;

public class Task1 {
    public static void main(String[] args) {

        // Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.

        int [] temp={78,60,101,80,100};
        int max=temp[0];
        int min=temp[0];

        for (int num : temp) {
            if (num>max) {
                max = num; {
                }
                System.out.println("Highest temp is: " +num);
            }

        }
        System.out.println();

        for (int num : temp) {
            if (num<min) {
                min= num; {
                }
                System.out.println("Lowest temp is: "+ num);
            }

        }


    }
}
