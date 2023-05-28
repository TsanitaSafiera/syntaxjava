package Class25;

import java.util.TreeSet;

public class Task2 {
    // Create a Set in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.

    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Germany");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Indonesia");
        countries.add("Malaysia");
        System.out.println(countries);
        for(String c:countries){
            System.out.println(c);
        }
    }
}
