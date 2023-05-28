package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    // Create a Set of cities in which you want to make sure that insertion
    // order is maintained. Then remove any city that starts with “A”;

    public static void main(String[] args) {
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Jakarta");
        cities.add("Atlanta");
        cities.add("Alabama");
        cities.add("Kuala lumpur");
        cities.add("Nairobi");

        cities.removeIf(X->X.startsWith("A"));
        System.out.println(cities);
    }
}
