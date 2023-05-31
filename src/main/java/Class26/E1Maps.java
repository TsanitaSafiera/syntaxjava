package Class26;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map <String, Double> drinks = new HashMap<>();

        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Coffee", 3.0);
        drinks.put("Tea", 3.5);

        //Collection<String> keys=makeup.keySet();// this will only print the keys.
        //System.out.println(keys);

        // //to remove keys
        drinks.keySet().removeIf(x-> x.contains("i"));
        System.out.println(drinks);
    }
}
