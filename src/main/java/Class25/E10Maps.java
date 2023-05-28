package Class25;

import java.util.Set;
import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup= new TreeMap<>();
        makeup.put("Lipstick",100.00);
        makeup.put("BlushOn",68.00);
        makeup.put("Eyeliner",80.00);
        makeup.put("Foundation",120.00);
        makeup.put("Base",25.00);

        Set<String>keys =  makeup.keySet();
        // this is how to remove all the mentioned value (keys and value will be removed)
        keys.removeIf(x -> x.contains("a"));
        System.out.println(makeup);

    }
}
