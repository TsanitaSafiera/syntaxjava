package Class25;

import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup= new TreeMap<>();
        makeup.put("Lipstick",100.00);
        makeup.put("BlushOn",68.00);
        makeup.put("Eyeliner",80.00);
        makeup.put("Foundation",120.00);
        makeup.put("Base",25.00);
        //var keys = makeup.keySet() we can use this too to simplify
        Set<String> keys=makeup.keySet();
        System.out.println(keys);
        var values=makeup.values();
        //Collection<Double> values= makeup.values();
        System.out.println(values);

    }
}
