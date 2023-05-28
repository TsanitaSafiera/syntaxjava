package Class9;

public class E1Arrays {
    public static void main(String[] args) {

        String name="Zak";
        String name2="Aladin";
        String name3="Farwa";

        /*
        String => data type
        []=> this is a part of the syntax
        names=> a variable name or name of the array
        = => assignment operator
        {} => one of the ways to create arrays
         */
        String [] names={"Jacob", "Lean", "Pavel"};
        System.out.println(names[0]);
        System.out.println(names[2]);

        /*
        create an array of int and store numbers from 30 40 50 90 inside it
        and access only the number 50
         */

        int [] numbers={30,40,50,90};
        System.out.println(numbers[2]);
    }
}
