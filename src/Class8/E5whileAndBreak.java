package Class8;

public class E5whileAndBreak {
    public static void main(String[] args) {
        /* create a boolean variable summer, store true in it
         and then write  a loop as long as it is summer create a temperature
         variable store 85 and
         inside the loop check the temp if it is less than 100 print
         "its good i enjoy summer' as soon as temperature exceeds 100 print
         "its very hot"
         and break the loop with break keywords

         */

        boolean summer=true;
        int temp=85;
        while (summer) {
            if (temp < 100) {
                System.out.println("It's good i enjoy summer");


            } else {
                System.out.println("Its very hot");
                break;

            }
            temp = temp + 2;
        }
    }
}
