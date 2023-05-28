package Class11;

public class HW6 {
    public static void main(String[] args) {
        /*
            Create 2D array of countries: north america countries, south america countries, europe countries,
            asian countries, african countries.
            Then print all values from that array using 2 different loops and calculate
            how many total countries been stored.

         */

        String [][] country={
                    {"USA","Canada","Mexico","Cuba"},
                    {"Argentina","Uruguay","Peru","Brazil"},
                    {"Germany","UK","France","Italy"},
                    {"Indonesia","Korea","Japan","China"},
                    {"Kenya","South Korea","Nigeria","Ethiopia"}
        };
        int counter=0;
        for (String[] list : country) {
            for (String name : list) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println();
        System.out.println("--------------");

        int counter1=0;
        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {
                counter1++;
            }
        }
        System.out.println(counter1);
    }
}
