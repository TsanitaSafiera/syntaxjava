package Class11;

public class HW3 {
    public static void main(String[] args) {

        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String [][] groceries={
                {"Oranges","Apples", "Grapes","Honeydew"},
                {"Kale","Broccoli","Spinach","Beet"},
                {"Cheese","Milk","Chocolate", "Ice Cream"},
                {"Candy","Cake", "Pie","Donuts"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+ " ");

            }


        }
        System.out.println();
        System.out.println("----------------------------------");

        for (String[] gro : groceries) {
            for (String name : gro) {
                System.out.print(name+ " ");

            }

        }
    }


}
