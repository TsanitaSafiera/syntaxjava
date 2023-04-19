package Class11;

public class HW2 {
    public static void main(String[] args) {

        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String [][] cars={
                    {"Ford","Chevrolet", "Lincoln","GMC"},
                    {"AUDI","Mercedes-Benz","Porsche","Volkswagen"},
                    {"Hyundai","Kia","Genesis", "Subaru"},
                    {"Lamborghini","Fiat", "Ferrari","Maserati"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+ " ");

            }


        }
        System.out.println();
        System.out.println("----------------------------------");

        for (String[] car : cars) {
            for (String name : car) {
                System.out.print(name+ " ");

            }

        }
    }
}
