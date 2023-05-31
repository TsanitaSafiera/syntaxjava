package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    // Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.

    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7664848,"Monitor");
        bestBuy.put(7664849,"Mouse");
        bestBuy.put(7664850,"Mouse Pad");
        bestBuy.put(7664847,"HDMI");

        //Set<Map.Entry<Integer, String>> entrySet = bestBuy.entrySet();
        var entrySet = bestBuy.entrySet();
        for (var e: entrySet){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
        /*
        for (var best : BestBuyStore.entrySet()) {
            System.out.println(best.getKey()+" "+best.getValue());
         */
    }
}


